package moka.menu.service;

import moka.basic.service.BasicServiceImpl;
import moka.menu.bo.Menu;
import moka.menu.dao.MenuDao;
import moka.menu.to.MenuTo;
import moka.menu.vo.MenuVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("menuService")
public class MenuServiceImpl extends BasicServiceImpl implements MenuService {

    @Resource
    private MenuDao menuDao;

    @Override
    public int insert(MenuVo vo) {
        Menu menu = this.convertBusinessValue(vo, Menu.class);
        menu.setCreateDate(new Date());
        menuDao.insert(menu);
        return menu.getId();
    }

    @Override
    public int update(MenuVo vo) {
        vo.setUpdateDate(new Date());
        return menuDao.update(vo);
    }

    @Override
    public int delete(int id) {
        return menuDao.delete(id);
    }

    @Override
    public MenuTo findOne(int id) {
        return menuDao.findOne(id);
    }

    @Override
    public MenuTo findAllMenu(MenuVo vo) {
        if(vo.getId() == 0) vo.setId(1);//默认获取根目录的所有子集
        return menuDao.findAllMenu(vo);
    }

    @Override
    public List<MenuTo> findNextChild(MenuVo vo) {
        return menuDao.findNextChild(vo);
    }
}
