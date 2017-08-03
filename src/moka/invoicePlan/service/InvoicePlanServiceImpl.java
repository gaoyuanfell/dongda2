package moka.invoicePlan.service;

import javax.annotation.Resource;

import moka.basic.page.Page;
import moka.contract.vo.ContractVo;
import moka.invoicePlan.to.InvoicePlanTo;
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
    public String insert(InvoicePlanVo inv) {
        InvoicePlan invoicePlan = this.convertBusinessValue(inv, InvoicePlan.class);
        invoicePlanDao.insert(invoicePlan);
        return invoicePlan.getId();
    }

    @Override
    public int update(InvoicePlanVo vo) {
        InvoicePlan invoicePlan = this.convertBusinessValue(vo, InvoicePlan.class);
        invoicePlan.setUpdateDate(new Date());
        return invoicePlanDao.update(invoicePlan);
    }

    @Override
    public InvoicePlanTo findOne(String id) {
        return invoicePlanDao.findOne(id);
    }

    @Override
    public Page findPage(InvoicePlanVo vo) {
        List list = invoicePlanDao.findPage(vo);
        int count = invoicePlanDao.findCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),count, list);
    }

    @Override
    public int insertBatch(List<InvoicePlanVo> invoicePlans) {
        return invoicePlanDao.insertBatch(invoicePlans);
    }

    @Override
    public List<InvoicePlanTo> findByContract(String contractId) {
        return invoicePlanDao.findByContract(contractId);
    }
}
