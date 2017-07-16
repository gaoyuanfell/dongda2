package moka.user.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.bo.Token;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.company.service.CompanyService;
import moka.company.to.CompanyTo;
import moka.menu.service.MenuService;
import moka.menu.to.MenuTo;
import moka.role.service.RoleService;
import moka.role.to.RoleTo;
import moka.user.service.UserService;
import moka.user.to.UserTo;
import moka.user.vo.UserVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController extends BasicController {

    @Resource
    private UserService userService;
    @Resource
    private MenuService menuService;
    @Resource
    private RoleService roleService;
    @Resource
    private CompanyService companyService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    @Value("#{propertyConfigurer['data_token_name']}")
    private String DEFAULT_TOKEN_NAME;

    /**
     * 登录
     * {
     * phoneNumber:'',
     * password:''
     * }
     */
    @RequestMapping(value = "login.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object login(@RequestBody UserVo userVo, HttpServletResponse response) {
        UserTo u = userService.login(userVo);
        boolean b = false;
        Token t = null;
        if (u != null) {
            u.setPassword("");
            MenuTo menuTo = menuService.findMenuByUserId(u.getId());//菜单
            List<RoleTo> roles = roleService.findUserRoles(u.getId());//角色
            CompanyTo companyTo = companyService.findOne(u.getCompanyId());
            u.setMenuTo(menuTo);
            u.setRoles(roles);
            u.setCompany(companyTo);
            t = new Token(u, Integer.toString(u.getId()));
            b = addUserSession(t);
        }
        if (b) {
            response.setHeader(DEFAULT_TOKEN_NAME, t.getToken());
            logger.info("登录成功！");
            return result(u);
        } else {
            return result(CODE_PROMPT, "手机号或者密码错误");
        }
    }

    /**
     * 增 注册专用 后面完善角色初始化、公司初始化。
     */
    @RequestMapping(value = "register.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insert(@RequestBody UserVo user) {
        int n = userService.findRepeatUser(user);
        if (n > 0) {
            return result(CODE_PROMPT, "用户名已存在！");
        }
        userService.insert(user);
        return result(CODE_SUCCESS,"创建成功，请登录");
    }

    /**
     * 系统用户添加
     */
    @RequestMapping(value = "insertSysUser.htm")
    @ResponseBody
    public Object insertSysUser(@RequestBody UserVo user){
        int n = userService.findRepeatUser(user);
        if (n > 0) {
            return result(CODE_PROMPT, "用户名已存在！");
        }
        UserTo to = getUserSession();
        user.setApplicationId(to.getApplicationId());
        user.setCompanyId(to.getCompanyId());
        userService.insertSysUser(user);
        return result(CODE_SUCCESS,"创建成功，请登录");
    }

    /**
     * 检查手机号是否重复
     * {
     * phoneNumber:''
     * }
     */
    @RequestMapping(value = "checkPhone.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object checkPhone(@RequestBody UserVo user) {
        int n = userService.checkPhone(user);
        if (n > 0) {
            return result(CODE_PROMPT, "手机号已存在！");
        }
        return result();
    }

    /**
     * 检查手机号是否重复
     * {
     * mail:''
     * }
     */
    @RequestMapping(value = "checkEmail.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object checkEmail(@RequestBody UserVo user) {
        int n = userService.checkEmail(user);
        if (n > 0) {
            return result(CODE_PROMPT, "邮箱已存在！");
        }
        return result();
    }

    /**
     * 查
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "findOne.htm")
    @ResponseBody
    public Object findOne(int id) {
        UserTo user = userService.findOne(id);
        return result(user);
    }


    /**
     * 用户修改
     * @param user
     * @return
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody UserVo user) {
        int i = userService.update(user);
        return result(i);
    }

    /**
     * 用户删除
     * @param id
     * @return
     */
    @RequestMapping(value = "delete.htm")
    @ResponseBody
    public Object delete(int id) {
        int i = userService.delete(id);
        return result(i);
    }


    /**
     * 查
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "findOneAll.htm")
    @ResponseBody
    public Object findOneAll(int id) {
        UserTo user = userService.findOneAll(id);
        return result(user);
    }

    /**
     * 从session获取用户信息
     */
    @RequestMapping(value = "findSessionUser.htm",method = RequestMethod.GET)
    @ResponseBody
    public Object findSessionUser(){
        return result(getUserSession());
    }

    /**
     * 查 所有
     *
     * @return
     */
    @RequestMapping(value = "findList.htm")
    @ResponseBody
    public Object findList(@RequestBody UserVo user) {
        UserTo to = getUserSession();
        user.setApplicationId(to.getApplicationId());
        List list = userService.findList(user);
        return result(list);
    }

    /**
     * 查 分页
     *
     * @return
     */
    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    public Object findPage(@RequestBody UserVo vo) {
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        Page list = userService.findPage(vo);
        return result(list);
    }

    /**
     * 退出
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "logout.htm", method = RequestMethod.GET)
    @ResponseBody
    public Object logout(HttpServletRequest request) {
        String token = request.getHeader(DEFAULT_TOKEN_NAME);
        Token t = new Token(token);
        boolean b = deleteLoginSession(t);
        if (b)
            return result();
        else
            return result(CODE_PROMPT, "注销登录失败");
    }
}