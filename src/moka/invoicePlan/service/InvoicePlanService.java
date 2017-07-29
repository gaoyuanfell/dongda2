package moka.invoicePlan.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.invoicePlan.vo.InvoicePlanVo;

import java.util.List;

public interface InvoicePlanService extends BasicService {

    String insert(InvoicePlanVo vo);

    int update(InvoicePlanVo vo);

    Page findPage(InvoicePlanVo vo);

    InvoicePlanTo findOne(String id);

    /**
     * 批量添加
     * @param invoicePlans
     * @return
     */
    int insertBatch(List<InvoicePlanVo> invoicePlans);

    /**
     * 根据合同id获取开票计划
     * @param contractId
     * @return
     */
    List<InvoicePlanTo> findByContract(String contractId);

}
