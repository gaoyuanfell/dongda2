package moka.invoice.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.customer.to.CustomerTo;
import moka.invoice.service.InvoiceService;
import moka.invoice.to.InvoiceTo;
import moka.invoice.vo.InvoiceVo;
import moka.user.to.UserTo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value="/invoice")
public class InvoiceController extends BasicController{
    @Resource
    private InvoiceService invoiceService;
    private Logger logger = LoggerService.getLogger(this.getClass());
    
    /**
     * 添加发票
     */
    @RequestMapping(value="insert.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insert(@RequestBody InvoiceVo vo){
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        String i = invoiceService.insert(vo);
        return result(i);
    }

    /**
     * 分页查询
     * @param vo
     * @return
     */
    @RequestMapping(value = "findPage.htm")
    @ResponseBody
    public Object findPage(@RequestBody InvoiceVo vo) {
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        Page page = invoiceService.findPage(vo);
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
        InvoiceTo to = invoiceService.findOne(id);
        return result(to);
    }
}
