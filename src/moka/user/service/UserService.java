package moka.user.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.user.bo.User;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface UserService extends BasicService {
    int insert(UserVo vo);

    UserTo findOne(Integer id);

    List findList(UserVo vo);

    Page findPage(UserVo vo);

    UserTo login(UserVo vo);

    int findRepeatUser(UserVo vo);

    int checkPhone(UserVo vo);

    int checkEmail(UserVo vo);
}
