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
import org.springframework.web.bind.annotation.RequestMethod;
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
     *
     */
    @RequestMapping(value = "findAllMenu.htm")
    @ResponseBody
    public Object findAllMenu(@RequestBody MenuVo vo){
        MenuTo to = menuService.findAllMenu(vo);
        return result(to);
    }

}