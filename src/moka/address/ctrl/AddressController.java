package moka.address.ctrl;

import moka.address.service.AddressService;
import moka.address.to.AddressTo;
import moka.address.to.DistrictTo;
import moka.address.vo.AddressVo;
import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/address")
public class AddressController extends BasicController {
    @Resource
    private AddressService addressService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    /**
     * 新增
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    public Object insert(@RequestBody AddressVo vo) {
        String i = addressService.insert(vo);
        return result(i);
    }

    /**
     * 修改
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody AddressVo vo) {
        int i = addressService.update(vo);
        return result(i);
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
        AddressTo to = addressService.findOne(id);
        return result(to);
    }

    /**
     * 地域 查找父级区域
     * @return
     */
    @RequestMapping(value = "findDistrictRoot.htm",method = RequestMethod.GET)
    @ResponseBody
    public Object findDistrictRoot(){
        List<DistrictTo> list = addressService.findDistrictRoot();
        return result(list);
    }

    /**
     * 地域 根据父ID查询子集
     * @return
     */
    @RequestMapping(value = "findDistrictByParentId.htm",method = RequestMethod.GET)
    @ResponseBody
    public Object findDistrictByParentId(String parentId){
        List<DistrictTo> list = addressService.findDistrictByParentId(parentId);
        return result(list);
    }

}
