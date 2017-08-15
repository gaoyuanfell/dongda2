package moka.contract.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.basic.util.Util;
import moka.contract.bo.Contract;
import moka.contract.dao.ContractDao;
import moka.contract.enums.ContractEnum;
import moka.contract.to.ContractTo;
import moka.contract.vo.ContractVo;
import moka.goods.service.GoodsService;
import moka.goods.to.GoodsTo;
import moka.invoicePlan.enums.InvoicePlanEnum;
import moka.invoicePlan.service.InvoicePlanService;
import moka.invoicePlan.vo.InvoicePlanVo;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service("contractService")
public class ContractServiceImpl extends BasicServiceImpl implements ContractService {
    @Resource
    private ContractDao contractDao;
    @Resource
    private InvoicePlanService invoicePlanService;
    @Resource
    private GoodsService goodsService;

    @Override
    public String insert(ContractVo con) {
        Contract contract = this.convertBusinessValue(con, Contract.class);
        contract.setCreateDate(new Date());
        contract.setContactState(ContractEnum.initial.getValue());
        contractDao.insert(contract);
        invoicePlanService.insertBatch(this.getPlanByContract(contract));
        return contract.getId();
    }

    @Override
    public ContractTo findOne(String id) {
        return contractDao.findOne(id);
    }

    @Override
    public ContractTo findOneAll(String id) {
        ContractTo to = contractDao.findOne(id);
        if(to != null){
            List l = invoicePlanService.findByContract(id);
            List<GoodsTo> goods = goodsService.findByContractId(to.getId());
            to.setInvoicePlans(l);
            to.setGoodsList(goods);
            return to;
        }
        return null;
    }

    @Override
    public int insertBatch(List<ContractVo> contracts) {
        //引入开票计划service 批量添加开票计划
        for (ContractVo vo : contracts) {
            this.insert(vo);
        }
        return 1;
    }

    @Override
    public Page findPage(ContractVo vo) {
        List list = contractDao.findPage(vo);
        int count = contractDao.findCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),count, list);
    }

    @Override
    public ContractTo findRepeatContract(ContractVo vo) {
        return contractDao.findRepeatContract(vo);
    }

    @Override
    public List<ContractTo> findUseSelect(ContractVo vo) {
        return contractDao.findUseSelect(vo);
    }

    /**
     * 根据合同你信息算出默认开票计划。
     * @param contracts
     * @return
     */
    @Nullable
    private List<InvoicePlanVo> getPlanByContract(Contract contracts) {
        List<InvoicePlanVo> vos = new ArrayList<>();
        int s = contracts.getPaymentNum();
        Date start = contracts.getStartDate();
        Date end = contracts.getEndDate();

        Calendar sc = null;
        //按次数分配开票计划的天数范围
        List<Integer> days = null;
        if (s > 0 && start != null && end != null) {
            sc = Calendar.getInstance();
            sc.setTime(start);
            int d = Util.differentDay(start, end);
            days = averageDay(d, s);
        }

        if (days != null) {
            BigDecimal amts = contracts.getAmt();
            //按次数分配开票计划的金额
            List<BigDecimal> bs = Util.average(amts, days.size());
            int index = 0;
            for (Integer day : days) {
                index++;
                InvoicePlanVo planVo = new InvoicePlanVo();
                planVo.setCreateDate(new Date());
                planVo.setContractId(contracts.getId());
                sc.add(Calendar.DATE, day);
                planVo.setPlanDate(sc.getTime());
                planVo.setPlanReceiveDate(sc.getTime());
                planVo.setPaymentPlanFact(index);
                planVo.setPlanAmt(bs.get(index - 1));
                planVo.setApplicationId(contracts.getApplicationId());
                planVo.setPlanState(InvoicePlanEnum.undone.getValue());
                vos.add(planVo);
            }
            return vos;
        }
        return null;
    }

    /**
     * 按开票次数平均分配天数，最后一天补满
     * @param day
     * @param divisor
     * @return
     */
    @Nullable
    private List<Integer> averageDay(int day, int divisor) {
        if (day > divisor) {
            List<Integer> ins = new ArrayList<>();
            int a = day % divisor;
            if (a == 0) {
                int b = day / divisor;
                while (divisor != 0) {
                    --divisor;
                    ins.add(b);
                }
                return ins;
            } else {
                a = day / divisor;
                for (int c = divisor; c > 0; --c) {
                    if (c == 1) {
                        ins.add(day - a * (divisor - 1));
                    } else {
                        ins.add(a);
                    }
                }
                return ins;
            }
        }
        return null;
    }

    @Override
    public List<ContractTo> findContractByAllData(ContractVo vo) {
        return contractDao.findContractByAllData(vo);
    }
}
