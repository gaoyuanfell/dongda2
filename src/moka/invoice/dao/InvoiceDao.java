package moka.invoice.dao;

import moka.basic.dao.BasicDao;
import moka.basic.page.Page;
import moka.invoice.bo.Invoice;
import moka.invoice.to.InvoiceTo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("invoice")
public interface InvoiceDao extends BasicDao<Invoice,InvoiceTo>{

    int insertBatch(List<Invoice> invoice);

    List<InvoiceTo> findBillingPage(Page page);

    int findBillingCount(Page page);

    List<InvoiceTo> findAccountPage(Page page);

    int findAccountCount(Page page);

    int methodInvoicedState(Invoice vo);

    int methodMailedState(Invoice vo);

    int methodReceivedState(Invoice vo);

    int methodCreditedState(Invoice vo);

    int methodPaymentState(Invoice vo);
}
