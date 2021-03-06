package moka.menu.service;

import moka.basic.log4j.LoggerService;
import moka.basic.service.BasicServiceImpl;
import moka.menu.bo.Menu;
import moka.menu.dao.MenuDao;
import moka.menu.to.MenuTo;
import moka.menu.vo.MenuVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by moka on 2017/3/6 0006.
 */
@Service("menuService")
public class MenuServiceImpl extends BasicServiceImpl implements MenuService {

    @Resource
    private MenuDao menuDao;
    private Logger logger = LoggerService.getLogger(this.getClass());

    @Override
    public String insert(MenuVo vo) {
        Menu menu = this.convertBusinessValue(vo, Menu.class);
        menu.setCreateDate(new Date());
        menuDao.insert(menu);
        return menu.getId();
    }

    @Override
    public int update(MenuVo vo) {
        vo.setUpdateDate(new Date());
        Menu menu = this.convertBusinessValue(vo, Menu.class);
        return menuDao.update(menu);
    }

    @Override
    public int delete(String id) {
        return menuDao.delete(id);
    }

    @Override
    public MenuTo findOne(String id) {
        return menuDao.findOne(id);
    }

    @Override
    public MenuTo findAllMenu(MenuVo vo) {
        if(StringUtils.isEmpty(vo.getId())) vo.setId("1");//默认获取根目录的所有子集
        return menuDao.findAllMenu(vo.getId());
    }

    @Override
    public List<MenuTo> findNextChild(MenuVo vo) {
        return menuDao.findNextChild(vo);
    }

    @Override
    public MenuTo findMenuByRoleId(MenuVo vo) {
        List<MenuTo> list = menuDao.findMenuByRoleId(vo.getRoleId());
        return getMenuTree(list);
    }

    /**
     * 菜单树构造
     */
    private MenuTo getMenuTree(List<MenuTo> list){
        List<MenuTo> _list = new ArrayList<>();
        MenuTo m = null;
        for(MenuTo t:list){
            if(t != null && t.getIsRoot() == 1){
                m = t;
                _list.add(m);
                list.remove(m);
                break;
            }
        }
        findChild(list,_list);
        return m;
    }

    //递归出所有的子集
    private void findChild(List<MenuTo> list ,List<MenuTo> to){
        for (MenuTo t : to){
            List<MenuTo> _list = new ArrayList<>();
            Iterator<MenuTo> iterator = list.iterator();
            while (iterator.hasNext()){
                MenuTo l = iterator.next();
                if(t.getId().equals(l.getParentId())){
                    _list.add(l);
                    iterator.remove();
                    list.remove(l);
                }
            }
            if(_list.size() > 0){
                t.setChildList(_list);
                findChild(list,_list);
            }
        }
    }

    @Override
    public MenuTo findMenuByUserId(String userId) {
        List<MenuTo> list = menuDao.findMenuByUserId(userId);
        return getMenuTree(list);
    }
}
