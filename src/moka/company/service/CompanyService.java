package moka.company.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface CompanyService extends BasicService {
    String insert(CompanyVo vo);

    int update(CompanyVo vo);

    Page findPage(CompanyVo vo);

    CompanyTo findOne(String id);

    /**
     * 作用于下拉
     * @param vo companyName companyBelong
     * @return
     */
    List<CompanyTo> findUseSelect(CompanyVo vo);

    /**
     * 作用于下拉 全部
     * @param vo companyName companyBelong
     * @return
     */
    List<CompanyTo> findUseAllSelect(CompanyVo vo);

    /**
     * 财务公司关联被管理公司
     * @param vo
     * @return
     */
    int relationCompany(CompanyVo vo);

    /**
     * 根据公司id获取关联的财务公司
     * @param companyId
     * @return
     */
    CompanyTo findRelationByComId(String companyId);

    /**
     * 根据财务公司ID获取被管理的业务公司集合
     * @param relationId
     * @return
     */
    List<CompanyTo> findComByRelationId(String relationId);
    
    /**
     * 关联员工id和公司id
     * @param id
     * @param companyId
     * @return
     */
    int insertComOfUser(String id, String companyId);
    
    /**
     * 根据公司名称获取公司id
     */
    String findComIdByName(CompanyVo company);

    /**
     * 查找和自己有关系的公司ID
     */
    List<Integer> findCompanyIdByUser(String userId);
    
    /**
     * 查找和自己有关系的公司ID
     */
    List<CompanyTo> findComIdByUser(String id);
}
