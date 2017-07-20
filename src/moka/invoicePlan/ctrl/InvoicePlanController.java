package moka.invoicePlan.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.bo.Token;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.contract.service.ContractService;
import moka.contract.vo.ContractVo;
import moka.invoicePlan.service.InvoicePlanService;
import moka.invoicePlan.vo.InvoicePlanVo;
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
@RequestMapping(value = "/invoicePlan")
public class InvoicePlanController extends BasicController {
    @Resource
    private InvoicePlanService invoicePlanService;

    /**
     * 添加开票计划
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insert(@RequestBody InvoicePlanVo vo) {
        int i = invoicePlanService.insert(vo);
        return result(i);
    }

    /**
     * 添加开票计划 批量
     */
    @RequestMapping(value = "insertBatch.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insertBatch(@RequestBody List<InvoicePlanVo> invoicePlans) {
        int i = invoicePlanService.insertBatch(invoicePlans);
        return result(i);
    }

}
