package moka.invoicePlan.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import moka.basic.service.BasicServiceImpl;
import moka.invoicePlan.bo.InvoicePlan;
import moka.invoicePlan.dao.InvoicePlanDao;
import moka.invoicePlan.vo.InvoicePlanVo;

@Service("invociceService")
public class InvoicePlanServiceImpl extends BasicServiceImpl implements InvoicePlanService{
    @Resource
    private InvoicePlanDao invoicePlanDao;

    @Override
    public int insert(InvoicePlanVo inv) {
        InvoicePlan invoicePlan = this.convertBusinessValue(inv, InvoicePlan.class);
        invoicePlanDao.insert(invoicePlan);
        return invoicePlan.getId();
    }
}
