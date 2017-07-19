package moka.contract.service;

import moka.basic.service.BasicServiceImpl;
import moka.contract.bo.Contract;
import moka.contract.dao.ContractDao;
import moka.contract.vo.ContractVo;
import moka.user.to.UserTo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("contractService")
public class ContractServiceImpl extends BasicServiceImpl implements ContractService {
    @Resource
    private ContractDao contractDao;

    @Override
    public int insert(ContractVo con) {
        Contract contract = this.convertBusinessValue(con, Contract.class);
        contract.setCreateDate(new Date());
        contractDao.insert(contract);
        return contract.getId();
    }

    @Override
    public int insertBatch(List<ContractVo> contracts, UserTo user) {
        //引入开票计划service 批量添加开票计划

        return contractDao.insertBatch(contracts);
    }
}
