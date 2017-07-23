package moka.company.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;
import moka.user.bo.User;

import java.util.List;

/**
 * Created by moka on 2017/3/5 0005.
 */
public interface CompanyService extends BasicService {
    int insert(CompanyVo vo);

    int update(CompanyVo vo);

    Page findPage(CompanyVo vo);

    CompanyTo findOne(int id);

    /**
     * 作用于下拉
     * @param vo
     * @return
     */
    List<CompanyTo> findUseSelect(CompanyVo vo);

}
