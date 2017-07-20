package moka.salesPlan.service;


import moka.basic.service.BasicService;
import moka.salesPlan.vo.SalesPlanVo;

public interface SalesPlanService extends BasicService {

    int insert(SalesPlanVo salesPlan);

}
