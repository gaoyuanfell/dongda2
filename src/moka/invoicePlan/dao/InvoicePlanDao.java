package moka.invoicePlan.dao;

import moka.invoicePlan.vo.InvoicePlanVo;
import org.springframework.stereotype.Repository;

import moka.invoicePlan.bo.InvoicePlan;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.basic.dao.BasicDao;

import java.util.List;

@Repository("invoicePlanDao")
public interface InvoicePlanDao extends BasicDao<InvoicePlan, InvoicePlanTo> {

    int insertBatch(List<InvoicePlanVo> invoicePlans);
}
