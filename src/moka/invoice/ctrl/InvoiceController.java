package moka.invoice.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.annotation.MetaDataSecurity;
import moka.basic.aspect.MetaData;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.basic.page.Page;
import moka.invoice.enums.InvoiceEnum;
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
        vo.setCreateUser(userTo.getId());
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
    public Object findPage(@RequestBody InvoiceVo vo,@MetaDataSecurity(value = {"lowerIds"}) MetaData metaData) {
        if(metaData == null){
            return result(CODE_PROMPT,"参数错误");
        }
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        vo.setLowerIds(metaData.getLowerIds());
        Page page = invoiceService.findPage(vo);
        return result(page);
    }

    /**
     * 修改
     * @param vo
     * @return
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody InvoiceVo vo) {
        InvoiceTo to = invoiceService.findOne(vo.getId());
        Boolean b1 = InvoiceEnum.ready.getValue().equals(to.getInvoiceState());
        Boolean b2 = InvoiceEnum.preparation.getValue().equals(to.getInvoiceState());
        if(b1 ||  b2){
            int i = invoiceService.update(vo);
            return result(i);
        }else{
            return result(CODE_PROMPT,"不能修改！");
        }

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

    /**
     * 根据id查找
     * @param id
     * @return
     */
    @RequestMapping(value = "findOneAll.htm")
    @ResponseBody
    public Object findOneAll(String id) {
        InvoiceTo to = invoiceService.findOneAll(id);
        return result(to);
    }

    /**
     * 分页查询 开票
     * @param vo
     * @return
     */
    @RequestMapping(value = "findBillingPage.htm")
    @ResponseBody
    public Object findBillingPage(@RequestBody InvoiceVo vo) {
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        Page page = invoiceService.findBillingPage(vo);
        return result(page);
    }

    /**
     * 分页查询 应收账款
     * @param vo
     * @return
     */
    @RequestMapping(value = "findAccountPage.htm")
    @ResponseBody
    public Object findAccountPage(@RequestBody InvoiceVo vo) {
        UserTo userTo = getUserSession();
        vo.setApplicationId(userTo.getApplicationId());
        Page page = invoiceService.findAccountPage(vo);
        return result(page);
    }

    /**
     * 开票
     * @param vo
     * @return
     */
    @RequestMapping(value = "methodInvoicedState.htm")
    @ResponseBody
    public Object methodInvoicedState(@RequestBody InvoiceVo vo){
        UserTo userTo = getUserSession();
        vo.setBillingId(userTo.getId());//开票人
        int i = invoiceService.methodInvoicedState(vo);
        return result(i);
    }

    /**
     * 已寄送 需要提供寄送地址
     * @param vo
     * @return
     */
    @RequestMapping(value = "methodMailedState.htm")
    @ResponseBody
    public Object methodMailedState(@RequestBody InvoiceVo vo){
        int i = invoiceService.methodMailedState(vo);
        return result(i);
    }

    /**
     * 已收到
     * @param vo
     * @return
     */
    @RequestMapping(value = "methodReceivedState.htm")
    @ResponseBody
    public Object methodReceivedState(@RequestBody InvoiceVo vo){
        int i = invoiceService.methodReceivedState(vo);
        return result(i);
    }

    /**
     * 已入账 审核入账
     * @param vo
     * @return
     */
    @RequestMapping(value = "methodCreditedState.htm")
    @ResponseBody
    public Object methodCreditedState(@RequestBody InvoiceVo vo){
        int i = invoiceService.methodCreditedState(vo);
        return result(i);
    }

    /**
     * 发票确认收款
     * @param vo
     * @return
     */
    @RequestMapping(value = "methodPaymentState.htm")
    @ResponseBody
    public Object methodPaymentState(@RequestBody InvoiceVo vo){
        int i = invoiceService.methodPaymentState(vo);
        return result(i);
    }

}
