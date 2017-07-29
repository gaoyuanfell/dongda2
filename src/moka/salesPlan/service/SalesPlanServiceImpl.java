package moka.salesPlan.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import moka.basic.service.BasicServiceImpl;
import moka.salesPlan.bo.SalesPlan;
import moka.salesPlan.dao.SalesPlanDao;
import moka.salesPlan.to.SalesPlanTo;
import moka.salesPlan.vo.SalesPlanVo;

@Service("salesPlanService")
public class SalesPlanServiceImpl extends BasicServiceImpl implements SalesPlanService{

    @Resource
    private SalesPlanDao salesPlanDao;
    
    @Override
    public String insert(SalesPlanVo sales) {
        SalesPlan salesplan = this.convertBusinessValue(sales, SalesPlan.class);
        salesplan.setCreateDate(new Date());
        salesPlanDao.insert(salesplan);
        return salesplan.getId();
    }

    @Override
    public List<SalesPlanTo> checkSalesPlan(SalesPlanVo sales) {
        SalesPlan salesplan = this.convertBusinessValue(sales, SalesPlan.class);
        //salesPlanDao.checkSalesPlan(salesplan);
        return salesPlanDao.checkSalesPlan(salesplan);
    }

}
