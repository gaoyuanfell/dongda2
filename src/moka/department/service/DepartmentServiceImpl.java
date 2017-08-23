package moka.department.service;

import moka.basic.service.BasicServiceImpl;
import moka.department.bo.Department;
import moka.department.dao.DepartmentDao;
import moka.department.to.DepartmentTo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service("departmentService")
public class DepartmentServiceImpl extends BasicServiceImpl implements DepartmentService{
    
    @Resource
    private DepartmentDao departmentDao;

    @Override
    public String insert(Department department) {
        Department de = this.convertBusinessValue(department, Department.class);
        de.setCreateDate(new Date());
        //默认0为根
        if(StringUtils.isEmpty(de.getParentId())){
            de.setParentId("0");
        }
        departmentDao.insert(de);
        return department.getId();
    }

    @Override
    public List<DepartmentTo> findByCompanyId(String companyId) {
        return departmentDao.findByCompanyId(companyId);
    }
}
