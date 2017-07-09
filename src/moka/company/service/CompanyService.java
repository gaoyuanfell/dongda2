package moka.company.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.company.vo.CompanyVo;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface CompanyService extends BasicService {
    int insert(CompanyVo vo);

    Page findPage(CompanyVo vo);
}
