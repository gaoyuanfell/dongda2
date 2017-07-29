package moka.company.ctrl;

import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.company.enums.CompanyEnum;
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
     * 新增公司 内部
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    public Object insert(@RequestBody CompanyVo vo) {
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        vo.setCompanyBelong(CompanyEnum.inside.getValue());
        String i = companyService.insert(vo);
        return result(i);
    }

    /**
     * 新增公司 外部
     */
    @RequestMapping(value = "insertBelong.htm")
    @ResponseBody
    public Object insertBelong(@RequestBody CompanyVo vo) {
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        vo.setCompanyBelong(CompanyEnum.external.getValue());
        String i = companyService.insert(vo);
        return result(i);
    }



    /**
     * 查 分页 内部
     */
    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    public Object findPage(@RequestBody CompanyVo vo) {
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        vo.setCompanyBelong(CompanyEnum.inside.getValue());
        Page list = companyService.findPage(vo);
        return result(list);
    }

    /**
     * 查 分页 外部
     */
    @RequestMapping(value = "findPageBelong.htm")
    @ResponseBody
    public Object findPageBelong(@RequestBody CompanyVo vo) {
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        vo.setCompanyBelong(CompanyEnum.external.getValue());
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
    public Object findOne(String id) {
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
     *      companyName:'',
     *      companyBelong:'' 1 内部 2 外部
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

    /**
     * 作用于下拉 全部有效数据 搜索条件
     * {
     *      companyName:'',
     *      companyBelong:'' 1 内部 2 外部,
     *
     * }
     *
     */
    @RequestMapping(value = "findUseAllSelect.htm")
    @ResponseBody
    public Object findUseAllSelect(@RequestBody CompanyVo vo) {
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        List<CompanyTo> list = companyService.findUseAllSelect(vo);
        return result(list);
    }


    /**
     * 业务公司关联财务公司
     * @param vo
     * @return
     */
    @RequestMapping(value = "relationCompany.htm")
    @ResponseBody
    public Object relationCompany(@RequestBody CompanyVo vo) {
        CompanyTo companyTo = companyService.findOne(vo.getCompanyId());
        if(companyTo != null){
            vo.setApplicationId(companyTo.getApplicationId());
            int i = companyService.relationCompany(vo);
            return result(i);
        }
        return result(CODE_PROMPT,"关联失败");
    }

    /**
     * 根据公司id获取关联的财务公司
     * @param companyId
     * @return
     */
    @RequestMapping(value = "findRelationByComId.htm")
    @ResponseBody
    public Object findRelationByComId(int companyId){
        return null;
    }


    /**
     * 根据财务公司ID获取被管理的业务公司集合
     * @param relationId
     * @return
     */
    @RequestMapping(value = "findComByRelationId.htm")
    @ResponseBody
    public Object findComByRelationId(int relationId){
        return null;
    }



}