package moka.basic.task;

import moka.basic.log4j.LoggerService;
import moka.invoice.service.InvoiceService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;

public class TaskJob {

    @Resource
    private InvoiceService invoiceService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    //根据开票计划生成发票
    public void autoInvoiceByPlan(){
        logger.info("***************定时任务开始***************");
        invoiceService.methodInvoiceByPlan(3);
        logger.info("***************定时任务结束***************");
    }
}
