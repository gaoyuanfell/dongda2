package moka.goods.service;

import moka.basic.page.Page;
import moka.basic.service.BasicServiceImpl;
import moka.goods.bo.Goods;
import moka.goods.dao.GoodsDao;
import moka.goods.to.GoodsTo;
import moka.goods.vo.GoodsVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl extends BasicServiceImpl implements GoodsService {

    @Resource
    private GoodsDao goodsDao;

    @Override
    public String insert(GoodsVo vo) {
        Goods goods = this.convertBusinessValue(vo,Goods.class);
        goods.setCreateDate(new Date());
        goodsDao.insert(goods);
        return goods.getId();
    }

    @Override
    public int update(GoodsVo vo) {
        Goods goods = this.convertBusinessValue(vo,Goods.class);
        goods.setUpdateDate(new Date());
        return goodsDao.update(goods);
    }

    @Override
    public Page findPage(GoodsVo vo) {
        List list = goodsDao.findPage(vo);
        int count = goodsDao.findCount(vo);
        return new Page(vo.getPageIndex(), vo.getPageSize(), count, list);
    }

    @Override
    public GoodsTo findOne(String id) {
        return goodsDao.findOne(id);
    }

    @Override
    public int insertBatch(List<GoodsVo> list) {
        return goodsDao.insertBatch(list);
    }

    @Override
    public List<GoodsTo> findByContractId(String contractId) {
        return goodsDao.findByContractId(contractId);
    }
}
