package moka.contract.dao;

import moka.basic.dao.BasicDao;
import moka.contract.bo.Contract;
import moka.contract.to.ContractTo;
import moka.contract.vo.ContractVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("contractDao")
public interface ContractDao extends BasicDao<Contract, ContractTo> {

    int insertBatch(List<ContractVo> contracts);

}
