package moka.invoicePlan.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.basic.page.Page;
import moka.invoicePlan.service.InvoicePlanService;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.invoicePlan.vo.InvoicePlanVo;
import moka.user.to.UserTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
     * 计划开票修改
     *
     * @param vo
     * @return
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody InvoicePlanVo vo) {
        int i = invoicePlanService.update(vo);
        return result(i);
    }

    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object findPage(@RequestBody InvoicePlanVo vo){
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        Page list = invoicePlanService.findPage(vo);
        return result(list);
    }


    @RequestMapping(value = "findOne.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object findOne(int id){
        InvoicePlanTo to = invoicePlanService.findOne(id);
        return result(to);
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

    /**
     * 根据合同id获取开票计划
     */
    @RequestMapping(value = "findByContract.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object findByContract(int id){
        List l = invoicePlanService.findByContract(id);
        return result(l);
    }

}
