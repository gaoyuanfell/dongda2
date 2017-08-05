package moka.invoice.ctrl;

import moka.basic.annotation.IgnoreSecurity;
import moka.basic.ctrl.BasicController;
import moka.invoice.service.InvoiceService;
import moka.invoice.vo.InvoiceVo;
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
    
    /**
     * 添加发票
     */
    @RequestMapping(value="addInvoice.htm")
    @ResponseBody
    @IgnoreSecurity
    public Object insert(@RequestBody InvoiceVo invoice){
        invoiceService.insert(invoice);
        return result(CODE_SUCCESS,"添加成功");
    }
}
