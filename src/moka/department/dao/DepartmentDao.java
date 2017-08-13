package moka.department.dao;

import moka.basic.dao.BasicDao;
import moka.department.bo.Department;
import moka.department.to.DepartmentTo;
import org.springframework.stereotype.Repository;

@Repository("departmentDao")
public interface DepartmentDao extends BasicDao<Department, DepartmentTo> {

}
