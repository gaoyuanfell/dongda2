package moka.goods.ctrl;

import moka.basic.ctrl.BasicController;
import moka.basic.log4j.LoggerService;
import moka.goods.service.GoodsService;
import moka.goods.to.GoodsTo;
import moka.goods.vo.GoodsVo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/goods")
public class GoodsController extends BasicController {

    @Resource
    private GoodsService goodsService;
    private Logger logger = LoggerService.getLogger(this.getClass());

    /**
     * 新增物品
     */
    @RequestMapping(value = "insert.htm")
    @ResponseBody
    public Object insert(@RequestBody GoodsVo vo){
        String i = goodsService.insert(vo);
        return result(i);
    }

    /**
     * 修改物品
     */
    @RequestMapping(value = "update.htm")
    @ResponseBody
    public Object update(@RequestBody GoodsVo vo){
        int i = goodsService.update(vo);
        return result(i);
    }


    /**
     * 查
     * @param id
     * @return
     */
    @RequestMapping(value = "findOne.htm")
    @ResponseBody
    public Object findOne(String id) {
        GoodsTo to = goodsService.findOne(id);
        return result(to);
    }

}
