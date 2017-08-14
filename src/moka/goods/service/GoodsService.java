package moka.goods.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.goods.to.GoodsTo;
import moka.goods.vo.GoodsVo;

import java.util.List;

public interface GoodsService extends BasicService {
    String insert(GoodsVo vo);

    int update(GoodsVo vo);

    Page findPage(GoodsVo vo);

    GoodsTo findOne(String id);

    int insertBatch(List<GoodsVo> list);
}
