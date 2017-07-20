package moka.invoicePlan.service;

import moka.basic.service.BasicService;
import moka.contract.vo.ContractVo;
import moka.invoicePlan.vo.InvoicePlanVo;

import java.util.List;

public interface InvoicePlanService extends BasicService {

    int insert(InvoicePlanVo vo);

    int insertBatch(List<InvoicePlanVo> invoicePlans);


}
