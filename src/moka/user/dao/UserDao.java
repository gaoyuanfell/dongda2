package moka.user.dao;

import moka.basic.dao.BasicDao;
import moka.company.vo.DepartmentVo;
import moka.role.to.RoleUserCompanyTo;
import moka.user.bo.User;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Repository("userDao")
public interface UserDao extends BasicDao<User, UserTo> {
    UserTo login(UserVo vo);

    int findRepeatUser(UserVo vo);

    int checkPhone(UserVo vo);

    int checkEmail(UserVo vo);

    List<UserTo> findUseSelect(UserVo vo);

    List<UserTo>  findSelectByCompanyId(String companyId);

    int insertLeaderRelation(UserVo vo);

    int deleteLeaderRelation(UserVo vo);

    List<String> findUserLeader(String userId);

    List<RoleUserCompanyTo> findCompanyRoleByUserId(String userId);
}