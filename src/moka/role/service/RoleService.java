package moka.role.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.role.to.RoleTo;
import moka.role.vo.RoleUserCompanyVo;
import moka.role.vo.RoleVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface RoleService extends BasicService {
    String insert(RoleVo vo);

    RoleTo findOne(String id);

    Page findPage(RoleVo vo);

    int update(RoleVo vo);

    int delete(String id);

    RoleTo findRepeatRole(RoleVo vo);

    /**
     * 角色关联菜单
     * @return
     */
    int insertMenuOfRole(List<RoleVo> vo);

    /**
     * 删除角色下的菜单
     * @param roleId
     * @return
     */
    int deleteMenuOfRole(String roleId);

    /**
     * 删除用户下的角色
     * @param userId
     * @return
     */
    int deleteRoleOfUser(String userId);


    /**
     * 用户关联角色
     * @return
     */
    int insertRoleOfUser(String userId,List<RoleUserCompanyVo> roleUserCompanies);

    /**
     * 查找用户下所有的角色
     * @param userId
     * @return
     */
    List<RoleTo> findUserRoles(String userId);

    /**
     * 作用于下拉
     * @param vo
     * @return
     */
    List<RoleTo> findUseSelect(RoleVo vo);

}
