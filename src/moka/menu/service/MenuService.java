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

    MenuTo findAllMenu(MenuVo vo);
}
