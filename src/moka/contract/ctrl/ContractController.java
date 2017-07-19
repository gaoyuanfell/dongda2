package moka.contract.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.contract.service.ContractService;
import moka.contract.vo.ContractVo;
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
        int i = contractService.insert(vo);
        return result(i);
    }


    /**
     * 批量添加合同
     */
    @RequestMapping(value = "addContract.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object inserts(@RequestBody List<ContractVo> contract) {
        for (ContractVo con : contract) {
            con.setCreateDate(new Date());
            contractService.insert(con);
        }
        return result(CODE_SUCCESS, "添加成功");
    }

}
