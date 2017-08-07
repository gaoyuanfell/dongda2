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

    InvoiceTo findOneAll(String id);

    //已开票
    int methodInvoicedState(InvoiceVo vo);

    //已寄送
    int methodMailedState(InvoiceVo vo);

    //已收到
    int methodReceivedState(InvoiceVo vo);

    //已入账 （发票审核阶段）
    int methodCreditedState(InvoiceVo vo);

    //已收账
    int methodPaymentState(InvoiceVo vo);
}
