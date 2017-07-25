package moka.salesPlan.service;


import java.util.List;

import moka.basic.service.BasicService;
import moka.salesPlan.to.SalesPlanTo;
import moka.salesPlan.vo.SalesPlanVo;

public interface SalesPlanService extends BasicService {

    int insert(SalesPlanVo salesPlan);

    List<SalesPlanTo> checkSalesPlan(SalesPlanVo salesPlan);

}
