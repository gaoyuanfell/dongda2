package moka.contract.dao;

import org.springframework.stereotype.Repository;

import moka.basic.dao.BasicDao;
import moka.contract.bo.Contract;
import moka.contract.to.ContractTo;

@Repository("contractDao")
public interface ContractDao extends BasicDao<Contract, ContractTo> {


}
