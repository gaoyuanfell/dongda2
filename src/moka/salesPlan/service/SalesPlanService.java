package moka.salesPlan.service;


import moka.basic.service.BasicService;
import moka.salesPlan.to.SalesPlanTo;
import moka.salesPlan.vo.SalesPlanVo;

import java.util.List;

public interface SalesPlanService extends BasicService {

    String insert(SalesPlanVo salesPlan);

    List<SalesPlanTo> checkSalesPlan(SalesPlanVo salesPlan);

}
