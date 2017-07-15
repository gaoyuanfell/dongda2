package moka.invoicePlan.service;

import moka.basic.service.BasicService;
import moka.invoicePlan.vo.InvoicePlanVo;

public interface InvoicePlanService extends BasicService {

    int insert(InvoicePlanVo inv);

}
