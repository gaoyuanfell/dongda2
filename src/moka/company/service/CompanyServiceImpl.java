package moka.company.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.company.bo.Company;
import moka.company.dao.CompanyDao;
import moka.company.enums.CompanyEnum;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("companyService")
public class CompanyServiceImpl extends BasicServiceImpl implements CompanyService {

    @Resource
    private CompanyDao companyDao;

    @Override
    public int insert(CompanyVo vo) {
        Company company = this.convertBusinessValue(vo, Company.class);
        company.setCreateDate(new Date());
        companyDao.insert(company);
        return company.getId();
    }

    @Override
    public int update(CompanyVo vo) {
        Company company = this.convertBusinessValue(vo, Company.class);
        company.setUpdateDate(new Date());
        return companyDao.update(company);
    }

    @Override
    public Page findPage(CompanyVo vo) {
        List list = companyDao.findPage(vo);
        int count = companyDao.findCount(vo);
        return new Page(vo.getPageIndex(), vo.getPageSize(), count, list);
    }

    @Override
    public CompanyTo findOne(int id) {
        return companyDao.findOne(id);
    }

    @Override
    public List<CompanyTo> findUseSelect(CompanyVo vo) {
        return companyDao.findUseSelect(vo);
    }

    @Override
    public List<CompanyTo> findUseAllSelect(CompanyVo vo) {
        return companyDao.findUseAllSelect(vo);
    }

    @Override
    public int relationCompany(CompanyVo vo) {
        vo.setCreateDate(new Date());
        vo.setRelationState(CompanyEnum.adminInside.getValue());
        return companyDao.relationCompany(vo);
    }

    @Override
    public CompanyTo findRelationByComId(int companyId) {
        return companyDao.findRelationByComId(companyId);
    }

    @Override
    public List<CompanyTo> findComByRelationId(int relationId) {
        return companyDao.findComByRelationId(relationId);
    }

    @Override
    public int insertComOfUser(int id, int companyId) {
        if(id>0 && companyId>0){
            CompanyVo company =new CompanyVo();
            company.setCompanyId(companyId);
            company.setUserId(id);
            company.setCreateDate(new Date());
            return companyDao.insertComOfUser(company);
        }
        return 0;
    }

    @Override
    public int findComIdByName(CompanyVo company) {
        List<CompanyTo> com =companyDao.findComIdByUser(company.getUserId());
        for(CompanyTo co : com){
            CompanyTo c = companyDao.findOne(co.getCompanyId());
            if(company.getCompanyName().equals(c.getCompanyName())){
                return co.getCompanyId();
            }
        }
        return 0;
    }

    @Override
    public List<Integer> findCompanyIdByUser(int userId) {
        return companyDao.findCompanyIdByUser(userId);
    }

    @Override
    public List<CompanyTo> findComIdByUser(int id) {
        return companyDao.findComIdByUser(id);
    }
}
