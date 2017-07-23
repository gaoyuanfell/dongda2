package moka.company.ctrl;

import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.company.service.CompanyService;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;
import moka.user.to.UserTo;
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
@RequestMapping(value = "/company")
public class CompanyController extends BasicController {

    @Resource
    private CompanyService companyService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    /**
     * 新增公司
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    public Object insert(@RequestBody CompanyVo vo) {
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

    /**
     * 查
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "findOne.htm")
    @ResponseBody
    public Object findOne(int id) {
        CompanyTo to = companyService.findOne(id);
        return result(to);
    }

    /**
     * 修改公司信息
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody CompanyVo vo) {
        int i = companyService.update(vo);
        return result(i);
    }

    /**
     * 作用于下拉 搜索条件
     * {
     *      companyName:''
     * }
     *
     */
    @RequestMapping(value = "findUseSelect.htm")
    @ResponseBody
    public Object findUseSelect(@RequestBody CompanyVo vo) {
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        List<CompanyTo> list = companyService.findUseSelect(vo);
        return result(list);
    }

}