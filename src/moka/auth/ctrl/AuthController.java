package moka.auth.ctrl;

import moka.auth.service.AuthService;
import moka.auth.vo.AuthVo;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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

}
