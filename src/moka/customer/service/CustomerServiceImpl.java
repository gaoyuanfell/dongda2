package moka.customer.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.company.dao.CompanyDao;
import moka.company.to.CompanyTo;
import moka.customer.bo.Customer;
import moka.customer.dao.CustomerDao;
import moka.customer.to.CustomerTo;
import moka.customer.vo.CustomerVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("customerService")
public class CustomerServiceImpl extends BasicServiceImpl implements CustomerService {

    @Resource
    private CustomerDao customerDao;
    @Resource
    private CompanyDao companyDao;

    @Override
    public int insert(CustomerVo vo) {
        Customer customer = this.convertBusinessValue(vo,Customer.class);
        customer.setCreateDate(new Date());
        customerDao.insert(customer);
        return customer.getId();
    }

    @Override
    public int delete(int id) {
        return customerDao.delete(id);
    }

    @Override
    public int update(CustomerVo vo) {
        Customer customer = this.convertBusinessValue(vo,Customer.class);
        customer.setUpdateDate(new Date());
        return customerDao.update(customer);
    }

    @Override
    public Page findPage(CustomerVo vo) {
        List list = customerDao.findPage(vo);
        int count = customerDao.findCount(vo);
        return new Page(vo.getPageIndex(),vo.getPageSize(),count, list);
    }

    @Override
    public CustomerTo findOne(int id) {
        return customerDao.findOne(id);
    }

    @Override
    public CompanyTo findComByCusId(int id) {
        CustomerTo to = customerDao.findOne(id);
        if(to != null){
            CompanyTo companyTo = companyDao.findOne(to.getCompanyId());
            return companyTo;
        }
        return null;
    }

    @Override
    public List<CustomerTo> findUseSelect(CustomerVo vo) {
        return customerDao.findUseSelect(vo);
    }
}
