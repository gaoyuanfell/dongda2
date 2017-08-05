package moka.role.dao;

import moka.basic.dao.BasicDao;
import moka.role.bo.Role;
import moka.role.to.RoleTo;
import moka.role.vo.RoleVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Repository("roleDao")
public interface RoleDao extends BasicDao<Role, RoleTo>{
    RoleTo findRepeatRole(RoleVo vo);

    int insertMenuOfRole(List<RoleVo> vo);

    int deleteMenuOfRole(String roleId);

    int deleteRoleOfUser(String userId);

    int insertRoleOfUser(List<RoleVo> vo);

    List<RoleTo> findUserRoles(String userId);

    List<RoleTo> findUseSelect(RoleVo vo);

    int insertAuthOfRole(List<RoleVo> vo);

    int deleteAuthOfRole(String roleId);
}
