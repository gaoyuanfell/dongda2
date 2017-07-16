package moka.customer.dao;

import moka.basic.dao.BasicDao;
import moka.customer.bo.Customer;
import moka.customer.to.CustomerTo;
import moka.customer.vo.CustomerVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Repository("customerDao")
public interface CustomerDao extends BasicDao<Customer, CustomerTo> {

    List<CustomerTo> findUseSelect(CustomerVo vo);
}
