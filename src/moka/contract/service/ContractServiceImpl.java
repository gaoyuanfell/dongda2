package moka.contract.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import moka.basic.service.BasicServiceImpl;
import moka.contract.bo.Contract;
import moka.contract.dao.ContractDao;
import moka.contract.vo.ContractVo;
import moka.user.service.UserService;

@Service("contractService")
public class ContractServiceImpl extends BasicServiceImpl implements ContractService{
    @Resource
    private ContractDao contractDao;
    
    @Override
    public int insert(ContractVo con){
        Contract contract =this.convertBusinessValue(con,Contract.class);
        contractDao.insert(contract);
        return contract.getId();
    }
    

}
