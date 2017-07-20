package moka.contract.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.contract.service.ContractService;
import moka.contract.vo.ContractVo;
import moka.user.to.UserTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/contract")
public class ContractController extends BasicController {
    @Resource
    private ContractService contractService;

    /**
     * 添加合同
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insert(@RequestBody ContractVo vo) {
        UserTo user = getUserSession();
        vo.setApplicationId(user.getApplicationId());
        int i = contractService.insert(vo);
        return result(i);
    }

    /**
     * 批量添加合同
     */
    @RequestMapping(value = "insertBatch.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insertBatch(@RequestBody List<ContractVo> contract) {
        UserTo user = getUserSession();
        for (ContractVo vo : contract){
            vo.setCreateDate(new Date());
            vo.setApplicationId(user.getApplicationId());
        }
        int i = contractService.insertBatch(contract);
        return result(i);
    }

}
