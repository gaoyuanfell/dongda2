package moka.contract.dao;

import moka.basic.dao.BasicDao;
import moka.contract.bo.Contract;
import moka.contract.to.ContractTo;
import org.springframework.stereotype.Repository;

@Repository("contractDao")
public interface ContractDao extends BasicDao<Contract, ContractTo> {


}
