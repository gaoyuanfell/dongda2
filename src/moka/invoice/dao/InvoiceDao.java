package moka.invoice.dao;

import moka.basic.dao.BasicDao;
import moka.invoice.bo.Invoice;
import moka.invoice.to.InvoiceTo;
import org.springframework.stereotype.Repository;

@Repository("invoice")
public interface InvoiceDao extends BasicDao<Invoice,InvoiceTo>{

}
