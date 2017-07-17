package moka.invoice.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import moka.basic.service.BasicServiceImpl;
import moka.contract.bo.Contract;
import moka.invoice.bo.Invoice;
import moka.invoice.dao.InvoiceDao;
import moka.invoice.vo.InvoiceVo;

@Service("invoiceService")
public class InvoiceServiceImpl extends BasicServiceImpl implements InvoiceService{
    @Resource
    private InvoiceDao invoiceDao;
    
    @Override
    public int insert(InvoiceVo invoices){
        Invoice invoice =this.convertBusinessValue(invoices,Invoice.class);
        invoiceDao.insert(invoice);
        return invoice.getId();
    }
}
