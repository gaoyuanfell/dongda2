package moka.role.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.role.to.RoleTo;
import moka.role.vo.RoleVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface RoleService extends BasicService {
    int insert(RoleVo vo);

    Page findPage(RoleVo vo);

}
