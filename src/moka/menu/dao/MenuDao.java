package moka.menu.dao;

import moka.basic.dao.BasicDao;
import moka.menu.bo.Menu;
import moka.menu.to.MenuTo;
import moka.menu.vo.MenuVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Repository("menuDao")
public interface MenuDao extends BasicDao<Menu, MenuTo> {
    MenuTo findAllMenu(String id);

    List<MenuTo> findNextChild(MenuVo vo);

    List<MenuTo> findMenuByRoleId(String roleId);

    List<MenuTo> findMenuByUserId(String userId);
}
