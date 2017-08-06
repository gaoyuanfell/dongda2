package moka.invoice.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.invoice.to.InvoiceTo;
import moka.invoice.vo.InvoiceVo;

public interface InvoiceService extends BasicService{

    String insert(InvoiceVo vo);

    int delete(String id);

    int update(InvoiceVo vo);

    Page findPage(InvoiceVo vo);

    InvoiceTo findOne(String id);

    //已开据
    void methodAlreadyState();

    //已开票
    void methodInvoicedState();

    //已寄送
    void methodMailedState();

    //已收到
    void methodReceivedState();

    //已入账
    void methodCreditedState();
}
