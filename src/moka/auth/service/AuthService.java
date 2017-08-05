package moka.auth.service;

import moka.auth.to.AuthTo;
import moka.auth.vo.AuthVo;
import moka.basic.page.Page;
import moka.basic.service.BasicService;

import java.util.List;

public interface AuthService extends BasicService {
    String insert(AuthVo vo);

    int update(AuthVo vo);

    Page findPage(AuthVo vo);

    AuthTo findOne(String id);

    /**
     * 作用于下拉
     * @param vo
     * @return
     */
    List<AuthTo> findUseSelect(AuthVo vo);

    /**
     * 查找用户权限
     * @param userId
     * @return
     */
    List<AuthTo> findUserAuth(String userId);
}
