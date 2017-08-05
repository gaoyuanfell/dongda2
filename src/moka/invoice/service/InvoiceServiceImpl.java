package moka.invoice.service;

import moka.basic.service.BasicServiceImpl;
import moka.invoice.bo.Invoice;
import moka.invoice.dao.InvoiceDao;
import moka.invoice.vo.InvoiceVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("invoiceService")
public class InvoiceServiceImpl extends BasicServiceImpl implements InvoiceService{
    @Resource
    private InvoiceDao invoiceDao;
    
    @Override
    public String insert(InvoiceVo invoices){
        Invoice invoice =this.convertBusinessValue(invoices,Invoice.class);
        invoiceDao.insert(invoice);
        return invoice.getId();
    }
}
