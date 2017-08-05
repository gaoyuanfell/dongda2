package moka.salesPlan.dao;

import moka.basic.dao.BasicDao;
import moka.salesPlan.bo.SalesPlan;
import moka.salesPlan.to.SalesPlanTo;

import java.util.List;

public interface SalesPlanDao extends BasicDao<SalesPlan, SalesPlanTo> {

    List<SalesPlanTo> checkSalesPlan(SalesPlan salesplan);


}
