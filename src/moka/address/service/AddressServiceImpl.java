package moka.address.service;

import moka.address.bo.Address;
import moka.address.dao.AddressDao;
import moka.address.to.AddressTo;
import moka.address.to.DistrictTo;
import moka.address.vo.AddressVo;
import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("addressService")
public class AddressServiceImpl extends BasicServiceImpl implements AddressService {

    @Resource
    private AddressDao addressDao;

    @Override
    public String insert(AddressVo vo) {
        Address auth = this.convertBusinessValue(vo,Address.class);
        auth.setCreateDate(new Date());
        addressDao.insert(auth);
        return auth.getId();
    }

    @Override
    public int update(AddressVo vo) {
        Address auth = this.convertBusinessValue(vo,Address.class);
        auth.setUpdateDate(new Date());
        return addressDao.update(auth);
    }

    @Override
    public AddressTo findOne(String id) {
        return addressDao.findOne(id);
    }

    @Override
    public int insertBatch(List<AddressVo> list) {
        return addressDao.insertBatch(list);
    }

    @Override
    public List<AddressTo> findByUserId(String userId) {
        return addressDao.findByUserId(userId);
    }

    @Override
    public List<DistrictTo> findDistrictRoot() {
        return addressDao.findDistrictRoot();
    }

    @Override
    public List<DistrictTo> findDistrictByParentId(String parentId) {
        return addressDao.findDistrictByParentId(parentId);
    }
}
