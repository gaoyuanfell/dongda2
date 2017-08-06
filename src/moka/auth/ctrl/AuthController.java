package moka.auth.ctrl;

import moka.auth.service.AuthService;
import moka.auth.to.AuthTo;
import moka.auth.vo.AuthVo;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/auth")
public class AuthController extends BasicController {

    @Resource
    private AuthService authService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    /**
     * 新增公司 内部
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    private Object insert(@RequestBody AuthVo vo){
        String i = authService.insert(vo);
        return result(i);
    }

    /**
     * 查 分页
     */
    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    public Object findPage(@RequestBody AuthVo vo) {
        Page list = authService.findPage(vo);
        return result(list);
    }

    /**
     * 查
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "findOne.htm")
    @ResponseBody
    public Object findOne(String id) {
        AuthTo to = authService.findOne(id);
        return result(to);
    }

    /**
     * 作用与下拉
     * @param vo
     * @return
     */
    @RequestMapping(value = "findUseSelect.htm")
    @ResponseBody
    public Object findUseSelect(@RequestBody AuthVo vo) {
        List<AuthTo> list = authService.findUseSelect(vo);
        return result(list);
    }

}
