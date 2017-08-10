package moka.basic.task;

import moka.contract.service.ContractService;
import moka.contract.to.ContractTo;
import moka.invoice.bo.Invoice;
import moka.invoice.enums.InvoiceEnum;
import moka.invoice.service.InvoiceService;
import moka.invoicePlan.service.InvoicePlanService;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.invoicePlan.vo.InvoicePlanVo;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskJob {

    @Resource
    private InvoiceService invoiceService;
    @Resource
    private InvoicePlanService invoicePlanService;
    @Resource
    private ContractService contractService;

    //根据开票计划生成发票
    public void autoInvoiceByPlan(){
        System.out.println("ok");

    }
}
