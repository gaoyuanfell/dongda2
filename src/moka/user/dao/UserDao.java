package moka.user.dao;

import moka.basic.dao.BasicDao;
import moka.role.to.RoleUserCompanyTo;
import moka.user.bo.User;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    int deleteLeaderRelation(String userId);

    List<String> findUserLeader(String userId);

    List<RoleUserCompanyTo> findCompanyRoleByUserId(String userId);
}