package moka.contract.service;

import moka.basic.service.BasicService;
import moka.contract.vo.ContractVo;

public interface ContractService extends BasicService {

    int insert(ContractVo contract);

}
