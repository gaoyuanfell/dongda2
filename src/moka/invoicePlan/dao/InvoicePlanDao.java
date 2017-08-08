package moka.invoicePlan.dao;

import moka.basic.dao.BasicDao;
import moka.invoicePlan.bo.InvoicePlan;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.invoicePlan.vo.InvoicePlanVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("invoicePlanDao")
public interface InvoicePlanDao extends BasicDao<InvoicePlan, InvoicePlanTo> {

    int insertBatch(List<InvoicePlanVo> invoicePlans);

    List<InvoicePlanTo> findByContract(InvoicePlanVo vo);

    int methodInvoicedState(InvoicePlan vo);
}
