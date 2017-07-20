package moka.salesPlan.ctrl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.invoicePlan.vo.InvoicePlanVo;
import moka.salesPlan.service.SalesPlanService;
import moka.salesPlan.vo.SalesPlanVo;

@Controller
@RequestMapping(value = "/salesPlan")
public class SalesPlanController extends BasicController {
    @Resource
    private SalesPlanService salesPlanService;

    /**
     * 添加销售计划
     */
    @RequestMapping(value = "addSalesPlan.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insert(@RequestBody SalesPlanVo salesPlan) {
        salesPlanService.insert(salesPlan);
        return result(CODE_SUCCESS, "添加成功");
    }
}
