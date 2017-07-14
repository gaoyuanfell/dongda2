package moka.contract.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.bo.Token;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.contract.service.ContractService;
import moka.contract.vo.ContractVo;
import moka.menu.service.MenuService;
import moka.menu.to.MenuTo;
import moka.user.service.UserService;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    @RequestMapping(value = "addContract.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insert(@RequestBody List<ContractVo> contract) {
        for (ContractVo con : contract) {
            con.setCreateDate(new Date());
            contractService.insert(con);
        }
        return result(CODE_SUCCESS, "添加成功");
    }

}
