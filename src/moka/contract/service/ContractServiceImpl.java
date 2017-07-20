package moka.contract.service;

import moka.basic.service.BasicServiceImpl;
import moka.basic.util.Util;
import moka.contract.bo.Contract;
import moka.contract.dao.ContractDao;
import moka.contract.enums.ContractEnum;
import moka.contract.vo.ContractVo;
import moka.invoicePlan.service.InvoicePlanService;
import moka.invoicePlan.vo.InvoicePlanVo;
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

    @Override
    public int insert(ContractVo con) {
        Contract contract = this.convertBusinessValue(con, Contract.class);
        contract.setCreateDate(new Date());
        contract.setContactState(ContractEnum.initial.getValue());
        contractDao.insert(contract);
        invoicePlanService.insertBatch(getPlanByContract(contract));
        return contract.getId();
    }

    @Override
    public int insertBatch(List<ContractVo> contracts) {
        //引入开票计划service 批量添加开票计划

        return contractDao.insertBatch(contracts);
    }

    public List<InvoicePlanVo> getPlanByContract(Contract contracts) {
        List<InvoicePlanVo> vos = new ArrayList<>();
        int s = contracts.getPaymentNum();
        Date start = contracts.getStartDate();
        Calendar sc = Calendar.getInstance();
        sc.setTime(start);
        BigDecimal amts = contracts.getAmt();
        Date end = contracts.getEndDate();
        if (s > 0 && start != null && end != null) {
            int d = Util.differentDay(start,end);
            List<Integer> days = averageDay(d,s);
            int index = 0;
            for (Integer day : days){
                index++;
                InvoicePlanVo planVo = new InvoicePlanVo();
                planVo.setCreateDate(new Date());
                planVo.setContractId(contracts.getId());
                sc.add(Calendar.DATE,day);
                planVo.setPlanDate(sc.getTime());
                planVo.setPlanReceiveDate(sc.getTime());
                planVo.setPaymentPlanFact(index);
                planVo.setAmt(amts);
                planVo.setApplicationId(contracts.getApplicationId());
                vos.add(planVo);
            }
            return vos;
        }
        return null;
    }

    public List<Integer> averageDay(int day, int divisor){
        if(day > divisor){
            List<Integer> ins = new ArrayList<>();
            int a = day % divisor;
            if(a == 0){
                int b = day / divisor;
                while (divisor != 0){
                    --divisor;
                    ins.add(b);
                }
                return ins;
            }else{
                a = day / divisor;
                for (int c = divisor; c > 0; --c){
                    ins.add(a);
                    if(c == 1){
                        ins.add(day - a * (divisor - 1));
                    }else{
                        ins.add(a);
                    }
                }
                return ins;
            }
        }
        return null;
    }

}
