package moka.invoicePlan.service;

import javax.annotation.Resource;

import moka.contract.vo.ContractVo;
import org.springframework.stereotype.Service;

import moka.basic.service.BasicServiceImpl;
import moka.invoicePlan.bo.InvoicePlan;
import moka.invoicePlan.dao.InvoicePlanDao;
import moka.invoicePlan.vo.InvoicePlanVo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("invoicePlanService")
public class InvoicePlanServiceImpl extends BasicServiceImpl implements InvoicePlanService{
    @Resource
    private InvoicePlanDao invoicePlanDao;

    @Override
    public int insert(InvoicePlanVo inv) {
        InvoicePlan invoicePlan = this.convertBusinessValue(inv, InvoicePlan.class);
        invoicePlanDao.insert(invoicePlan);
        return invoicePlan.getId();
    }

    @Override
    public int insertBatch(List<InvoicePlanVo> invoicePlans) {
        return invoicePlanDao.insertBatch(invoicePlans);
    }

}
