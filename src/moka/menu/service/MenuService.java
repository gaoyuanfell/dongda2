package moka.menu.service;

import moka.basic.service.BasicService;
import moka.menu.to.MenuTo;
import moka.menu.vo.MenuVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface MenuService extends BasicService {
    int insert(MenuVo vo);

    MenuTo findOne(int id);

    int update(MenuVo vo);

    int delete(int id);

    MenuTo findAllMenu(MenuVo vo);

    /**
     * 查找子集集合
     * @param vo
     * @return
     */
    List<MenuTo> findNextChild(MenuVo vo);

    /**
     * 查找子集集合 对应权限
     * @param vo
     * @return
     */
    MenuTo findMenuByRoleId(MenuVo vo);

}
