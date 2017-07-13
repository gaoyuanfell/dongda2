package moka.role.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.role.bo.Role;
import moka.role.dao.RoleDao;
import moka.role.to.RoleTo;
import moka.role.vo.RoleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("roleService")
public class RoleServiceImpl extends BasicServiceImpl implements RoleService {

    @Resource
    private RoleDao roleDao;

    @Override
    public int insert(RoleVo vo) {
        Role role = this.convertBusinessValue(vo, Role.class);
        role.setCreateDate(new Date());
        roleDao.insert(role);
        return role.getId();
    }

    @Override
    public RoleTo findOne(Integer id) {
        return roleDao.findOne(id);
    }

    @Override
    public Page findPage(RoleVo vo) {
        List list = roleDao.findPage(vo);
        int count = roleDao.findCount();
        return new Page(vo.getPageIndex(), vo.getPageSize(), count, list);
    }

    @Override
    public int insertMenuOfRole(List<RoleVo> vo) {
        roleDao.deleteMenuOfRole(vo.get(0).getRoleId());
        return roleDao.insertMenuOfRole(vo);
    }

    @Override
    public int deleteMenuOfRole(int id) {
        return roleDao.deleteMenuOfRole(id);
    }

    @Override
    public int insertRoleOfUser(int userId, List<Integer> roles) {
        List<RoleVo> vo = new ArrayList<>();
        for (int i : roles) {
            RoleVo v = new RoleVo();
            v.setRoleId(i);
            v.setUserId(userId);
            vo.add(v);
        }
        return roleDao.insertRoleOfUser(vo);
    }
}
