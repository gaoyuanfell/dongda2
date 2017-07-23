package moka.role.ctrl;

import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.role.service.RoleService;
import moka.role.to.RoleTo;
import moka.role.vo.RoleVo;
import moka.user.to.UserTo;
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
@RequestMapping(value = "/role")
public class RoleController extends BasicController {

    @Resource
    private RoleService roleService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    @RequestMapping(value = "insert.htm")
    @ResponseBody
    public Object insert(@RequestBody RoleVo vo){
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        RoleTo to = roleService.findRepeatRole(vo);
        if(to == null){
            int i = roleService.insert(vo);
            return result(i);
        }else{
            return result(CODE_PROMPT,"角色名称不能重复");
        }
    }

    /**
     * 修改
     * @param vo
     * @return
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody RoleVo vo){
        roleService.update(vo);
        return result();
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "delete.htm")
    @ResponseBody
    public Object delete(int id){
        roleService.delete(id);
        return result();
    }


    /**
     * 根据id查找
     */
    @RequestMapping(value = "findOne.htm",method = RequestMethod.GET)
    @ResponseBody
    public Object findOne(int id) {
        RoleTo to = roleService.findOne(id);
        return result(to);
    }


    /**
     * 查 分页
     */
    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    public Object findPage(@RequestBody RoleVo vo) {
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        Page list = roleService.findPage(vo);
        return result(list);
    }

    /**
     * 角色关联菜单
     *
     */
    @RequestMapping(value = "insertMenuOfRole.htm")
    @ResponseBody
    public Object insertMenuOfRole(@RequestBody List<RoleVo> vo) {
        int i = roleService.insertMenuOfRole(vo);
        return result(i);
    }

    /**
     * 作用于下拉 搜索条件
     * {
     *     name:''
     * }
     *
     */
    @RequestMapping(value = "findUseSelect.htm")
    @ResponseBody
    public Object findUseSelect(@RequestBody RoleVo vo){
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        List<RoleTo> list = roleService.findUseSelect(vo);
        return result(list);
    }


}