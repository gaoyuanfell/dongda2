package moka.role.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.menu.dao.MenuDao;
import moka.role.bo.Role;
import moka.role.dao.RoleDao;
import moka.role.to.RoleTo;
import moka.role.bo.RoleUserCompany;
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
    public String insert(RoleVo vo) {
        Role role = this.convertBusinessValue(vo, Role.class);
        role.setCreateDate(new Date());
        roleDao.insert(role);
        return role.getId();
    }

    @Override
    public RoleTo findOne(String id) {
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
    public int delete(String id) {
        int i = roleDao.delete(id);
        if(i > 0){
            roleDao.deleteMenuOfRole(id);
            return 1;
        }
        return 0;
    }

    @Override
    public RoleTo findRepeatRole(RoleVo vo) {
        return roleDao.findRepeatRole(vo);
    }

    @Override
    public int insertMenuOfRole(List<RoleVo> vo) {
        roleDao.deleteMenuOfRole(vo.get(0).getRoleId());
        return roleDao.insertMenuOfRole(vo);
    }

    @Override
    public int deleteMenuOfRole(String roleId) {
        return roleDao.deleteMenuOfRole(roleId);
    }

    @Override
    public int deleteRoleOfUser(String userId) {
        return roleDao.deleteRoleOfUser(userId);
    }

    @Override
    public int insertRoleOfUser(String userId,List<RoleUserCompany> roleUserCompanies) {
        roleDao.deleteRoleOfUser(userId);
        List<RoleVo> vo = new ArrayList<>();
        for (RoleUserCompany userCompany:roleUserCompanies){
            for (String roleId : userCompany.getRoleId()){
                RoleVo v = new RoleVo();
                v.setRoleId(roleId);
                v.setCompanyId(userCompany.getCompanyId());
                v.setUserId(userId);
                vo.add(v);
            }
        }
        return roleDao.insertRoleOfUser(vo);
    }

    @Override
    public List<RoleTo> findUserRoles(String userId) {
        return roleDao.findUserRoles(userId);
    }

    @Override
    public List<RoleTo> findUseSelect(RoleVo vo) {
        return roleDao.findUseSelect(vo);
    }
}
