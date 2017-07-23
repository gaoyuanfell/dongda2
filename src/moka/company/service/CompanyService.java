package moka.company.service;

import moka.basic.page.Page;
import moka.basic.service.BasicService;
import moka.company.to.CompanyTo;
import moka.company.vo.CompanyVo;

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
     * @param vo companyName companyBelong
     * @return
     */
    List<CompanyTo> findUseSelect(CompanyVo vo);

    /**
     * 作用于下拉 全部
     * @param vo companyName companyBelong
     * @return
     */
    List<CompanyTo> findUseAllSelect(CompanyVo vo);

    /**
     * 财务公司关联被管理公司
     * @param vo
     * @return
     */
    int relationCompany(CompanyVo vo);

}
