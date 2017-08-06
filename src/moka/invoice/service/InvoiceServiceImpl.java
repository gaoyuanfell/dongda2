package moka.invoice.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.invoice.bo.Invoice;
import moka.invoice.dao.InvoiceDao;
import moka.invoice.enums.InvoiceEnum;
import moka.invoice.to.InvoiceTo;
import moka.invoice.vo.InvoiceVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("invoiceService")
public class InvoiceServiceImpl extends BasicServiceImpl implements InvoiceService{
    @Resource
    private InvoiceDao invoiceDao;
    
    @Override
    public String insert(InvoiceVo vo){
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setFactInvoiceDate(new Date());
        invoice.setCreateDate(new Date());
        invoice.setInvoiceState(InvoiceEnum.preparation.getValue());
        invoiceDao.insert(invoice);
        return invoice.getId();
    }

    @Override
    public int delete(String id) {
        return invoiceDao.delete(id);
    }

    @Override
    public int update(InvoiceVo vo) {
        Invoice invoice = this.convertBusinessValue(vo,Invoice.class);
        invoice.setUpdateDate(new Date());
        return invoiceDao.update(invoice);
    }

    @Override
    public Page findPage(InvoiceVo vo) {
        List list = invoiceDao.findPage(vo);
        int count = invoiceDao.findCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),count, list);
    }

    @Override
    public InvoiceTo findOne(String id) {
        return invoiceDao.findOne(id);
    }

    @Override
    public void methodAlreadyState() {

    }

    @Override
    public void methodInvoicedState() {

    }

    @Override
    public void methodMailedState() {

    }

    @Override
    public void methodReceivedState() {

    }

    @Override
    public void methodCreditedState() {

    }
}
