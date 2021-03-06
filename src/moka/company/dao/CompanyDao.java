package moka.company.dao;

import moka.basic.dao.BasicDao;
import moka.company.bo.Company;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Repository("companyDao")
public interface CompanyDao extends BasicDao<Company, CompanyTo> {
    List<CompanyTo> findUseSelect(CompanyVo vo);

    List<CompanyTo> findUseAllSelect(CompanyVo vo);

    List<CompanyTo> findUseSelectByUser(CompanyVo vo);

    int relationCompany(CompanyVo vo);

    CompanyTo findRelationByComId(String companyId);

    List<CompanyTo> findComByRelationId(String relationId);

    List<String> findCompanyIdByUser(String userId);

    List<CompanyTo> findCompanyByUser(String userId);
}
