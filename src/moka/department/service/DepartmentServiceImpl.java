package moka.department.service;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import moka.basic.service.BasicServiceImpl;
import moka.department.bo.Department;
import moka.department.dao.DepartmentDao;

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
