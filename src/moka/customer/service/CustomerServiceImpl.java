package moka.customer.service;

import moka.address.service.AddressService;
import moka.address.to.AddressTo;
import moka.address.vo.AddressVo;
import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.company.service.CompanyService;
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
    private CompanyService companyService;
    @Resource
    private AddressService addressService;

    @Override
    public String insert(CustomerVo vo) {
        Customer customer = this.convertBusinessValue(vo,Customer.class);
        customer.setCreateDate(new Date());
        customerDao.insert(customer);
        String id = customer.getId();
        String applicationId = customer.getApplicationId();
        List<AddressVo> addressList = vo.getAddressList();
        for (AddressVo addressVo : addressList){
            addressVo.setApplicationId(applicationId);
            addressVo.setUserId(id);
        }
        addressService.insertBatch(addressList);
        return id;
    }

    @Override
    public int delete(String id) {
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
    public CustomerTo findOne(String id) {
        return customerDao.findOne(id);
    }

    @Override
    public CustomerTo findOneAll(String id) {
        CustomerTo to = customerDao.findOne(id);
        if(to != null){
            CompanyTo company = companyService.findOne(to.getCompanyId());
            to.setCompany(company);
            List<AddressTo> addressList = addressService.findByUserId(id);
            to.setAddressList(addressList);
        }
        return to;
    }

    @Override
    public List<CustomerTo> findUseSelect(CustomerVo vo) {
        return customerDao.findUseSelect(vo);
    }
}
