package moka.invoicePlan.dao;

import org.springframework.stereotype.Repository;

import moka.invoicePlan.bo.InvoicePlan;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.basic.dao.BasicDao;

@Repository("invoicePlanDao")
public interface InvoicePlanDao extends BasicDao<InvoicePlan,InvoicePlanTo>{


}
