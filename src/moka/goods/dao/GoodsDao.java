package moka.goods.dao;

import moka.basic.dao.BasicDao;
import moka.goods.bo.Goods;
import moka.goods.to.GoodsTo;
import moka.goods.vo.GoodsVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("authDao")
public interface GoodsDao extends BasicDao<Goods, GoodsTo> {

}
