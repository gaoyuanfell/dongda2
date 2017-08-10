package moka.contract.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.contract.to.ContractTo;
import moka.contract.vo.ContractVo;

import java.util.List;

public interface ContractService extends BasicService {

    String insert(ContractVo contract);

    ContractTo findOne(String id);

    ContractTo findOneAll(String id);

    Page findPage(ContractVo vo);

    /**
     * 批量添加合同
     * @param contracts
     * @return
     */
    int insertBatch(List<ContractVo> contracts);

    /**
     * 按合同号查询 即查询是否有相同的合同号
     * @param vo contractNo
     * @return
     */
    ContractTo findRepeatContract(ContractVo vo);

    /**
     * 作用于下拉
     * @param vo contractNo
     * @return
     */
    List<ContractTo> findUseSelect(ContractVo vo);

    /**
     * 作用于下拉 获取合同全部字段
     * @param vo
     * @return
     */
    List<ContractTo> findContractByAllData(ContractVo vo);

}