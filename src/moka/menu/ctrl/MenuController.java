package moka.menu.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.menu.service.MenuService;
import moka.menu.to.MenuTo;
import moka.menu.vo.MenuVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Controller
@RequestMapping(value = "/menu")
public class MenuController extends BasicController {

    @Resource
    private MenuService menuService;
    private Logger logger = LoggerService.getLogger(this.getClass());


    /**
     * 查看根目录下所有的子目录 id存在就查找某条分支下面的所有子目录
     * {
     *     id:0
     * }
     */
    @RequestMapping(value = "findAllMenu.htm")
    @ResponseBody
    public Object findAllMenu(@RequestBody MenuVo vo){
        MenuTo to = menuService.findAllMenu(vo);
        return result(to);
    }

    /**
     * 查看根目录下所有的子目录 关联Role角色
     * {
     *     id:0
     * }
     */
    @RequestMapping(value = "findRoleMenu.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object findRoleMenu(@RequestBody MenuVo vo){
        MenuTo to = menuService.findMenuByRoleId(vo);
        return result(to);
    }

    /**
     * 添加菜单
     * {
     *      name:'',
     *      link:'',
     *      icon:'',
     *      type:'',
     *      parentId:'',
     * }
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    public Object insert(@RequestBody MenuVo vo){
        String i = menuService.insert(vo);
        return result(i);
    }

    /**
     * 修改菜单
     * {
     *      name:'',
     *      link:'',
     *      icon:'',
     *      type:'',
     * }
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody MenuVo vo){
        int i = menuService.update(vo);
        return result(i);
    }

    /**
     * 删除菜单
     * {
     *      id:'',
     * }
     */
    @RequestMapping(value = "delete.htm")
    @ResponseBody
    public Object delete(@RequestBody MenuVo vo){
        List<MenuTo> list = menuService.findNextChild(vo);
        if(list.size() > 0){
            return result(CODE_PROMPT,"不能删除，有子集的菜单！");
        }
        int i = menuService.delete(vo.getId());
        return result(i);
    }

}