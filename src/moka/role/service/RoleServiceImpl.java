package moka.role.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.menu.dao.MenuDao;
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
    @Resource
    private MenuDao menuDao;

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
        List<RoleTo> list = roleDao.findPage(vo);
        for (RoleTo t : list){
            if(t != null){
                String s = t.getMenuStr();
                if(s != null){
                    String[] ms = s.split(",");
                    t.setMenus(ms);
                }
            }
        }
        int count = roleDao.findCount(vo);
        return new Page(vo.getPageIndex(), vo.getPageSize(), count, list);
    }

    @Override
    public int update(RoleVo vo) {
        Role role = this.convertBusinessValue(vo, Role.class);
        role.setUpdateDate(new Date());
        return roleDao.update(role);
    }

    @Override
    public int delete(int id) {
        roleDao.deleteMenuOfRole(id);
        return roleDao.delete(id);
    }

    @Override
    public int insertMenuOfRole(List<RoleVo> vo) {
        roleDao.deleteMenuOfRole(vo.get(0).getRoleId());
        return roleDao.insertMenuOfRole(vo);
    }

    @Override
    public int deleteMenuOfRole(int roleId) {
        return roleDao.deleteMenuOfRole(roleId);
    }

    @Override
    public int deleteRoleOfUser(int userId) {
        return roleDao.deleteRoleOfUser(userId);
    }

    @Override
    public int insertRoleOfUser(int userId, List<Integer> roles) {
        roleDao.deleteRoleOfUser(userId);
        if(roles != null && roles.size() > 0){
            List<RoleVo> vo = new ArrayList<>();
            for (int i : roles) {
                RoleVo v = new RoleVo();
                v.setRoleId(i);
                v.setUserId(userId);
                vo.add(v);
            }
            return roleDao.insertRoleOfUser(vo);
        }
        return 0;
    }

    @Override
    public List<RoleTo> findUserRoles(int userId) {
        return roleDao.findUserRoles(userId);
    }

    @Override
    public List<RoleTo> findUseSelect(RoleVo vo) {
        return roleDao.findUseSelect(vo);
    }
}
