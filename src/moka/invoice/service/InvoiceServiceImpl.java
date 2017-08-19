package moka.invoice.service;

import moka.address.service.AddressService;
import moka.address.vo.MailedVo;
import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.contract.service.ContractService;
import moka.contract.to.ContractTo;
import moka.invoice.bo.Invoice;
import moka.invoice.dao.InvoiceDao;
import moka.invoice.enums.InvoiceEnum;
import moka.invoice.to.InvoiceTo;
import moka.invoice.vo.InvoiceVo;
import moka.invoicePlan.service.InvoicePlanService;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.invoicePlan.vo.InvoicePlanVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("invoiceService")
public class InvoiceServiceImpl extends BasicServiceImpl implements InvoiceService{
    @Resource
    private InvoiceDao invoiceDao;
    @Resource
    private InvoicePlanService invoicePlanService;
    @Resource
    private ContractService contractService;
    @Resource
    private AddressService addressService;
    
    @Override
    public String insert(InvoiceVo vo){
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setCreateDate(new Date());
        invoice.setInvoiceState(InvoiceEnum.preparation.getValue());
        invoiceDao.insert(invoice);
        //改变此开票计划状态
        invoicePlanService.methodInvoicedState(vo.getInvoicePlanId());
        return invoice.getId();
    }

    @Override
    public int insertBatch(List<Invoice> invoices) {
        return invoiceDao.insertBatch(invoices);
    }

    @Override
    public int delete(String id) {
        return invoiceDao.delete(id);
    }

    @Override
    public int update(InvoiceVo vo) {
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setUpdateDate(new Date());
        invoice.setInvoiceState(InvoiceEnum.preparation.getValue());
        return invoiceDao.update(invoice);
    }

    @Override
    public Page findPage(InvoiceVo vo) {
        List list = invoiceDao.findPage(vo);
        int count = invoiceDao.findCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),count, list);
    }

    @Override
    public Page findBillingPage(InvoiceVo vo) {
        List list = invoiceDao.findBillingPage(vo);
        int count = invoiceDao.findBillingCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),count, list);
    }

    @Override
    public Page findAccountPage(InvoiceVo vo) {
        List list = invoiceDao.findAccountPage(vo);
        int count = invoiceDao.findAccountCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),count, list);
    }

    @Override
    public InvoiceTo findOne(String id) {
        return invoiceDao.findOne(id);
    }

    @Override
    public InvoiceTo findOneAll(String id) {
        return invoiceDao.findOneAll(id);
    }

    @Override
    public int methodInvoicedState(InvoiceVo vo) {
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setFactInvoiceDate(new Date());//开票时间
        invoice.setInvoiceState(InvoiceEnum.invoiced.getValue());
        invoice.setUpdateDate(new Date());
        return invoiceDao.methodInvoicedState(invoice);
    }

    @Override
    public int methodMailedState(InvoiceVo vo) {
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setInvoiceState(InvoiceEnum.mailed.getValue());
        invoice.setUpdateDate(new Date());
        //快递信息
        MailedVo mailedVo = vo.getMailed();
        mailedVo.setApplicationId(vo.getApplicationId());
        addressService.insertMailed(mailedVo);
        return invoiceDao.methodMailedState(invoice);
    }

    @Override
    public int methodReceivedState(InvoiceVo vo) {
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setInvoiceState(InvoiceEnum.received.getValue());
        invoice.setUpdateDate(new Date());
        return invoiceDao.methodReceivedState(invoice);
    }

    @Override
    public int methodCreditedState(InvoiceVo vo) {
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setInvoiceState(InvoiceEnum.recorded.getValue());
        invoice.setUpdateDate(new Date());
        return invoiceDao.methodCreditedState(invoice);
    }

    @Override
    public int methodPaymentState(InvoiceVo vo) {
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setInvoiceState(InvoiceEnum.payment.getValue());
        invoice.setFactPaymentDate(new Date());//收款时间
        invoice.setUpdateDate(new Date());
        return invoiceDao.methodPaymentState(invoice);
    }

    @Override
    public int methodInvoiceByPlan(int planDay) {
        if(planDay > 0){
            InvoicePlanVo vo = new InvoicePlanVo();
            vo.setPlanDay(planDay);
            List<InvoicePlanTo> planToList = invoicePlanService.findList(vo);
            List<String> planIds = new ArrayList<>();
            List<Invoice> invoiceList = new ArrayList<>();
            for (InvoicePlanTo to: planToList){
                ContractTo contractTo = contractService.findOne(to.getContractId());
                if(contractTo != null){
                    Invoice invoice = new Invoice();
                    invoice.setContractId(contractTo.getId());
                    invoice.setCompanyPayId(contractTo.getCompanyPayId());
                    invoice.setCompanySaleId(contractTo.getCompanySaleId());
                    invoice.setInvoicePlanId(to.getId());
                    invoice.setInvoiceState(InvoiceEnum.ready.getValue());
                    invoice.setCreateDate(new Date());
                    invoice.setPlanAmt(to.getPlanAmt());
                    invoice.setPlanInvoiceDate(to.getPlanDate());
                    invoice.setApplicationId(contractTo.getApplicationId());
                    invoice.setCreateUser(contractTo.getCompanySaleUserId());
                    invoiceList.add(invoice);
                    planIds.add(to.getId());
                }
            }

            if(planIds.size() > 0 && invoiceList.size() > 0){
                invoicePlanService.updateBatchById(planIds);
                return this.insertBatch(invoiceList);
            }
        }
        return 0;
    }
}
