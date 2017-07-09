package moka.user.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.user.dao.UserDao;
import moka.user.to.UserTo;
import moka.user.bo.User;
import moka.user.vo.UserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("userService")
public class UserServiceImpl extends BasicServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int insert(UserVo vo) {
        User user = this.convertBusinessValue(vo, User.class);
        user.setCreateDate(new Date());
        userDao.insert(user);
        return user.getId();
    }

    @Override
    public UserTo findOne(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public Page findPage(UserVo vo) {
        List list = userDao.findPage(vo);
        int totalCount = userDao.findCount();
        return new Page(vo.getPageSize(),totalCount, list);
    }

    @Override
    public List findList(UserVo vo) {
        return userDao.findList(vo);
    }

    @Override
    public UserTo login(UserVo vo) {
        return userDao.login(vo);
    }

    @Override
    public int findRepeatUser(UserVo vo) {
        return userDao.findRepeatUser(vo);
    }

    @Override
    public int checkPhone(UserVo vo) {
        return userDao.checkPhone(vo);
    }

    @Override
    public int checkEmail(UserVo vo) {
        return userDao.checkEmail(vo);
    }
}
