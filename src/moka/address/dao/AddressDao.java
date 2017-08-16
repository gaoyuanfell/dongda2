package moka.address.dao;

import moka.address.bo.Address;
import moka.address.bo.District;
import moka.address.to.AddressTo;
import moka.address.to.DistrictTo;
import moka.basic.dao.BasicDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("addressDao")
public interface AddressDao extends BasicDao<Address, AddressTo> {

    List<DistrictTo> findDistrictRoot();

    List<DistrictTo> findDistrictByParentId(String parentId);
}
