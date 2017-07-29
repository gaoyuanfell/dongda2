package moka.customer.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.company.to.CompanyTo;
import moka.customer.service.CustomerService;
import moka.customer.to.CustomerTo;
import moka.customer.vo.CustomerVo;
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
@RequestMapping(value = "/customer")
public class CustomerController extends BasicController {

    @Resource
    private CustomerService customerService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    /**
     * 客户新增
     * @param vo
     * @return
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    public Object insert(@RequestBody CustomerVo vo) {
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        String n = customerService.insert(vo);
        return result(n);
    }

    /**
     * 客户删除
     * @param id
     * @return
     */
    @RequestMapping(value = "delete.htm")
    @ResponseBody
    public Object delete(String id) {
        int n = customerService.delete(id);
        return result(n);
    }

    /**
     * 客户修改
     * @param vo
     * @return
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody CustomerVo vo) {
        int n = customerService.update(vo);
        return result(n);
    }

    /**
     * 分页查询
     * @param vo
     * @return
     */
    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    public Object findPage(@RequestBody CustomerVo vo) {
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        Page page = customerService.findPage(vo);
        return result(page);
    }

    /**
     * 根据id查找
     * @param id
     * @return
     */
    @RequestMapping(value = "findOne.htm")
    @ResponseBody
    public Object findOne(String id) {
        CustomerTo to = customerService.findOne(id);
        return result(to);
    }

    /**
     * 根据客户id获取公司信息
     * @return
     */
    @RequestMapping(value = "findComByCusId.htm")
    @ResponseBody
    public Object findComByCusId(String id){
        CompanyTo to = customerService.findComByCusId(id);
        return result(to);
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
    public Object findUseSelect(@RequestBody CustomerVo vo){
        UserTo to = getUserSession();
        vo.setApplicationId(to.getApplicationId());
        List<CustomerTo> list = customerService.findUseSelect(vo);
        return result(list);
    }
}