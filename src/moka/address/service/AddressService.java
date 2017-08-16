package moka.address.service;

import moka.address.to.AddressTo;
import moka.address.to.DistrictTo;
import moka.address.vo.AddressVo;
import moka.basic.page.Page;
import moka.basic.service.BasicService;

import java.util.List;

public interface AddressService extends BasicService {
    String insert(AddressVo vo);

    int update(AddressVo vo);

    AddressTo findOne(String id);


    /**
     * 地域 查找父级区域
     * @return
     */
    List<DistrictTo> findDistrictRoot();

    /**
     * 地域 根据父ID查询子集
     * @param parentId
     * @return
     */
    List<DistrictTo> findDistrictByParentId(String parentId);
}
