package moka.invoice.service;

import moka.basic.service.BasicService;
import moka.invoice.vo.InvoiceVo;

public interface InvoiceService extends BasicService{

    String insert(InvoiceVo invoice);

}
