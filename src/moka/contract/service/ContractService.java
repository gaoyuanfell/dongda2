package moka.contract.service;

import moka.basic.service.BasicService;
import moka.contract.vo.ContractVo;
import moka.user.to.UserTo;

import java.util.List;

public interface ContractService extends BasicService {

    int insert(ContractVo contract);

    /**
     * 批量添加合同
     * @param contracts
     * @return
     */
    int insertBatch(List<ContractVo> contracts, UserTo user);

}