package moka.company.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.company.bo.Company;
import moka.company.dao.CompanyDao;
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
        Company role = this.convertBusinessValue(vo, Company.class);
        role.setCreateDate(new Date());
        companyDao.insert(role);
        return role.getId();
    }

    @Override
    public Page findPage(CompanyVo vo) {
        List list = companyDao.findPage(vo);
        int count = companyDao.findCount();
        return new Page(vo.getPageSize(), count, list);
    }
}
