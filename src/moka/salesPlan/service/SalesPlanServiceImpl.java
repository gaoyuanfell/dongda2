package moka.salesPlan.service;

import moka.basic.service.BasicServiceImpl;
import moka.salesPlan.bo.SalesPlan;
import moka.salesPlan.dao.SalesPlanDao;
import moka.salesPlan.to.SalesPlanTo;
import moka.salesPlan.vo.SalesPlanVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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
