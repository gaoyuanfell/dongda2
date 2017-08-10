package moka.invoicePlan.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.invoicePlan.bo.InvoicePlan;
import moka.invoicePlan.dao.InvoicePlanDao;
import moka.invoicePlan.enums.InvoicePlanEnum;
import moka.invoicePlan.to.InvoicePlanTo;
import moka.invoicePlan.vo.InvoicePlanVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
    public int updateBatchById(List<String> ids) {
        return invoicePlanDao.updateBatchById(ids);
    }

    @Override
    public List<InvoicePlanTo> findList(InvoicePlanVo vo) {
        return invoicePlanDao.findList(vo);
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
        InvoicePlanVo vo  = new InvoicePlanVo();
        vo.setContractId(contractId);
        return invoicePlanDao.findByContract(vo);
    }

    @Override
    public List<InvoicePlanTo> findByContract(InvoicePlanVo vo) {
        return invoicePlanDao.findByContract(vo);
    }

    @Override
    public int methodInvoicedState(String id) {
        InvoicePlan vo = new InvoicePlan();
        vo.setId(id);
        vo.setPlanState(InvoicePlanEnum.invoiced.getValue());
        vo.setUpdateDate(new Date());
        return invoicePlanDao.methodInvoicedState(vo);
    }
}
