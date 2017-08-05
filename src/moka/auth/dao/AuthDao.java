package moka.auth.dao;

import moka.auth.bo.Auth;
import moka.auth.to.AuthTo;
import moka.auth.vo.AuthVo;
import moka.basic.dao.BasicDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("authDao")
public interface AuthDao extends BasicDao<Auth, AuthTo> {

    List<AuthTo> findUseSelect(AuthVo vo);

    List<AuthTo> findUserAuth(String userId);
}
