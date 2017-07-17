package moka.invoice.dao;

import org.springframework.stereotype.Repository;

import moka.basic.dao.BasicDao;
import moka.invoice.bo.Invoice;
import moka.invoice.to.InvoiceTo;

@Repository("invoice")
public interface InvoiceDao extends BasicDao<Invoice,InvoiceTo>{

}
