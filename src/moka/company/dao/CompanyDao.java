package moka.company.dao;

import moka.basic.dao.BasicDao;
import moka.company.bo.Company;
import moka.company.to.CompanyTo;
import org.springframework.stereotype.Repository;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Repository("companyDao")
public interface CompanyDao extends BasicDao<Company, CompanyTo> {

}
