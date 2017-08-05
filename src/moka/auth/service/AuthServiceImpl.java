package moka.auth.service;

import moka.auth.bo.Auth;
import moka.auth.dao.AuthDao;
import moka.auth.to.AuthTo;
import moka.auth.vo.AuthVo;
import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("authService")
public class AuthServiceImpl extends BasicServiceImpl implements AuthService {

    @Resource
    private AuthDao authDao;

    @Override
    public String insert(AuthVo vo) {
        Auth auth = this.convertBusinessValue(Auth.class,vo);
        auth.setCreateDate(new Date());
        authDao.insert(auth);
        return auth.getId();
    }

    @Override
    public int update(AuthVo vo) {
        Auth auth = this.convertBusinessValue(Auth.class,vo);
        auth.setUpdateDate(new Date());
        return authDao.update(auth);
    }

    @Override
    public Page findPage(AuthVo vo) {
        List list = authDao.findPage(vo);
        int count = authDao.findCount(vo);
        return new Page(vo.getPageIndex(), vo.getPageSize(), count, list);
    }

    @Override
    public AuthTo findOne(String id) {
        return authDao.findOne(id);
    }

    @Override
    public List<AuthTo> findUseSelect(AuthVo vo) {
        return authDao.findUseSelect(vo);
    }

    @Override
    public List<AuthTo> findUserAuth(String userId) {
        return authDao.findUserAuth(userId);
    }
}
