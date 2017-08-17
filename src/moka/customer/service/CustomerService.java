package moka.customer.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.company.to.CompanyTo;
import moka.customer.to.CustomerTo;
import moka.customer.vo.CustomerVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface CustomerService extends BasicService {
    String insert(CustomerVo vo);

    int delete(String id);

    int update(CustomerVo vo);

    Page findPage(CustomerVo vo);

    CustomerTo findOne(String id);

    CustomerTo findOneAll(String id);
    /**
     * 作用于下拉
     * @param vo companyId name
     * @return
     */
    List<CustomerTo> findUseSelect(CustomerVo vo);
}
