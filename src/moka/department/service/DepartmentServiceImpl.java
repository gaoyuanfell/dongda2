package moka.department.service;

import moka.basic.service.BasicServiceImpl;
import moka.department.bo.Department;
import moka.department.dao.DepartmentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service("departmentService")
public class DepartmentServiceImpl extends BasicServiceImpl implements DepartmentService{
    
    @Resource
    private DepartmentDao departmentDao;

    @Override
    public String insert(Department department) {
        Department de = this.convertBusinessValue(department, Department.class);
        de.setCreateDate(new Date());
        departmentDao.insert(de);
        return department.getId();
    }

}
