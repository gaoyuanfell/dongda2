package moka.user.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.role.to.RoleUserCompanyTo;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface UserService extends BasicService {
    /**
     * 用户注册
     * @param vo
     * @return
     */
    String insert(UserVo vo);

    /**
     * 用户添加
     * @param vo
     * @return
     */
    String insertSysUser(UserVo vo);

    int update(UserVo vo);

    int delete(String id);

    UserTo findOne(String id);

    /**
     * 查找用户 关联查询
     * @param id
     * @return
     */
    UserTo findOneAll(String id);

    List findList(UserVo vo);

    Page findPage(UserVo vo);

    UserTo login(UserVo vo);

    /**
     * 查找重复用户
     * @param vo
     * @return
     */
    int findRepeatUser(UserVo vo);

    /**
     * 检查手机号重复
     * @param vo
     * @return
     */
    int checkPhone(UserVo vo);

    /**
     * 检查邮箱重复
     * @param vo
     * @return
     */
    int checkEmail(UserVo vo);

    /**
     * 用于下拉
     * @param vo
     * @return
     */
    List<UserTo> findUseSelect(UserVo vo);

    /**
     * 根据公司Id获取用户 作用于下拉
     * @param companyId
     */
    List<UserTo>  findSelectByCompanyId(String companyId);

    /**
     * 用户关联直接上级领导
     * userId
     * leaderId
     * @return
     */
    int insertLeaderRelation(UserVo vo);

    /**
     * 用户解除直接上级领导
     * userId
     * @return
     */
    int deleteLeaderRelation(String userId);

    /**
     * 获取用户下所有下属ID 包含自己的ID 方便查询
     * @param userId
     * @return
     */
    List<String> findUserLeader(String userId);

    /**
     * 根据用户id获取每个公司的角色情况
     * @param userId
     * @return
     */
    List<RoleUserCompanyTo> findCompanyRoleByUserId(String userId);

}
