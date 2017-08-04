package moka.contract.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.basic.page.Page;
import moka.contract.service.ContractService;
import moka.contract.to.ContractTo;
import moka.contract.vo.ContractVo;
import moka.user.to.UserTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
        vo.setCreateUser(user.getId());
        ContractTo to = contractService.findRepeatContract(vo);
        if (to != null) {
            return result(CODE_PROMPT,String.format("合同号：%s 已存在。\n", vo.getContractNo()));
        }
        String i = contractService.insert(vo);
        return result(i);
    }

    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object findPage(@RequestBody ContractVo vo){
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        Page list = contractService.findPage(vo);
        return result(list);
    }


    @RequestMapping(value = "findOne.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object findOne(String id){
        ContractTo to = contractService.findOne(id);
        return result(to);
    }

    /**
     * 批量添加合同
     */
    @RequestMapping(value = "insertBatch.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insertBatch(@RequestBody List<ContractVo> contract) {
        UserTo user = getUserSession();
        String msg = "";
        for (ContractVo vo : contract) {
            vo.setApplicationId(user.getApplicationId());
            ContractTo to = contractService.findRepeatContract(vo);
            if (to != null) {
                String s = String.format("合同号：%s 已存在。\n", to.getContractNo());
                msg = msg.concat(s);
            }
        }
        if("".equals(msg)){
            return result(CODE_PROMPT,msg);
        }
        int i = contractService.insertBatch(contract);
        return result(i);
    }

    /**
     * 作用于下拉 搜索条件
     * {
     *     contractNo:''
     * }
     *
     */
    @RequestMapping(value = "findUseSelect.htm")
    @ResponseBody
    public Object findUseSelect(@RequestBody ContractVo vo){
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        List<ContractTo> list = contractService.findUseSelect(vo);
        return result(list);
    }

}
