package moka.role.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.role.bo.Role;
import moka.role.to.RoleTo;
import moka.role.vo.RoleVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface RoleService extends BasicService {
    int insert(RoleVo vo);

    RoleTo findOne(Integer id);

    Page findPage(RoleVo vo);

    int update(RoleVo vo);

    int delete(int id);
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
    int deleteMenuOfRole(int roleId);

    /**
     * 删除用户下的角色
     * @param userId
     * @return
     */
    int deleteRoleOfUser(int userId);


    /**
     * 用户关联角色
     * @param userId 用户id
     * @param roles 角色集合
     * @return
     */
    int insertRoleOfUser(int userId, List<Integer> roles);

    /**
     * 查找用户下所有的角色
     * @param userId
     * @return
     */
    List<RoleTo> findUserRoles(int userId);

    /**
     * 作用于下拉
     * @param vo
     * @return
     */
    List<RoleTo> findUseSelect(RoleVo vo);

}
