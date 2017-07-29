package moka.menu.service;

import moka.basic.service.BasicService;
import moka.menu.to.MenuTo;
import moka.menu.vo.MenuVo;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface MenuService extends BasicService {
    String insert(MenuVo vo);

    MenuTo findOne(String id);

    int update(MenuVo vo);

    int delete(String id);

    /**
     * 查询所有菜单
     */
    MenuTo findAllMenu(MenuVo vo);

    /**
     * 查找子集集合 用于删除时判断父级是否有子集
     * @param vo
     * @return
     */
    List<MenuTo> findNextChild(MenuVo vo);

    /**
     * 查找角色对应的菜单
     * @param vo
     * @return
     */
    MenuTo findMenuByRoleId(MenuVo vo);


    /**
     * 获取用户下的菜单
     * @param userId
     * @return
     */
    MenuTo findMenuByUserId(String userId);

}
