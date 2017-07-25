package moka.salesPlan.dao;

import java.util.List;

import moka.basic.dao.BasicDao;
import moka.salesPlan.bo.SalesPlan;
import moka.salesPlan.to.SalesPlanTo;

public interface SalesPlanDao extends BasicDao<SalesPlan, SalesPlanTo> {

    List<SalesPlanTo> checkSalesPlan(SalesPlan salesplan);


}
