package moka.company.ctrl;

import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.company.service.CompanyService;
import moka.company.vo.CompanyVo;
import moka.user.to.UserTo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by moka on 2017/3/5 0005.
 */
@Controller
@RequestMapping(value = "/company")
public class CompanyController extends BasicController {

    @Resource
    private CompanyService companyService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    public Object insert(@RequestBody CompanyVo vo){
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        int i = companyService.insert(vo);
        return result(i);
    }

    /**
     * 查 分页
     */
    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    public Object findPage(@RequestBody CompanyVo vo) {
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        Page list = companyService.findPage(vo);
        return result(list);
    }
}