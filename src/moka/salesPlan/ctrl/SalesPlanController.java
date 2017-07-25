package moka.salesPlan.ctrl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.company.enums.CompanyEnum;
import moka.company.service.CompanyService;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;
import moka.customer.service.CustomerService;
import moka.customer.to.CustomerTo;
import moka.customer.vo.CustomerVo;
import moka.invoicePlan.vo.InvoicePlanVo;
import moka.salesPlan.service.SalesPlanService;
import moka.salesPlan.to.SalesPlanTo;
import moka.salesPlan.vo.SalesPlanVo;
import moka.user.to.UserTo;

@Controller
@RequestMapping(value = "/salesPlan")
public class SalesPlanController extends BasicController {
    @Resource
    private SalesPlanService salesPlanService;
    @Resource
    private CompanyService companyService;
    @Resource
    private CustomerService customerService;

    /**
     * 添加销售计划
     */
    @RequestMapping(value = "addSalesPlan.htm")
    @ResponseBody
    public Object insert(@RequestBody SalesPlanVo salesPlan) {
        while (salesPlan.getAmt() != null && salesPlan.getContractName() != null && salesPlan.getBuyComName() != null
                && salesPlan.getComContactsName() != null) {
            Integer comId = null;
            UserTo userTo = getUserSession();
            CompanyVo company = new CompanyVo();
            CustomerVo customer = new CustomerVo();
            company.setApplicationId(userTo.getApplicationId());
            company.setCompanyBelong(CompanyEnum.external.getValue());
            company.setCompanyName(salesPlan.getBuyComName());
            customer.setName(salesPlan.getComContactsName());
            customer.setApplicationId(userTo.getApplicationId());
            List<CompanyTo> com = companyService.findUseSelect(company);
            List<CustomerTo> cus = customerService.findUseSelect(customer);
            salesPlan.setUserId(userTo.getId());
            salesPlan.setCreateDate(new Date());
            salesPlan.setComId(userTo.getCompanyId());
            if (com.size() != 0) {
                for (CompanyTo co : com) {
                    salesPlan.setBuyComId(co.getId());
                }
            } else {
                comId = companyService.insert(company);
                salesPlan.setBuyComId(comId);
            }
            if (cus.size() != 0) {
                for (CustomerTo cu : cus) {
                    salesPlan.setComContactsId(cu.getId());
                }
            } else {
                customer.setCompanyId(salesPlan.getBuyComId());
                salesPlan.setComContactsId(customerService.insert(customer));
            }
            salesPlanService.insert(salesPlan);
            return result(CODE_SUCCESS, "添加成功");
        }
        return result("参数错误");
    }
    
    /**
     * 查找销售计划
     */
    @RequestMapping(value = "checkSalesPlan.htm")
    @ResponseBody
    public Object checkSalesPlan(@RequestBody SalesPlanVo salesPlan) {
        UserTo userTo = getUserSession();
        salesPlan.setComId(userTo.getCompanyId());
        List<SalesPlanTo> list = salesPlanService.checkSalesPlan(salesPlan);
        for(SalesPlanTo sal:list){
            CompanyTo com = new CompanyTo();
            CustomerTo cus = new CustomerTo();
            com = companyService.findOne(sal.getBuyComId());
            cus = customerService.findOne(sal.getComContactsId());
            sal.setBuyComName(com.getCompanyName());
            sal.setComContactsName(cus.getName());
        }
        return result(list);
        
    }
}
