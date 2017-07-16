package moka.company.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.company.bo.Company;
import moka.company.dao.CompanyDao;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        return new Page(vo.getPageIndex(),vo.getPageSize(), count, list);
    }

    @Override
    public CompanyTo findOne(int id) {
        return companyDao.findOne(id);
    }

    @Override
    public List<CompanyTo> findUseSelect(CompanyVo vo) {
        return companyDao.findUseSelect(vo);
    }
}
