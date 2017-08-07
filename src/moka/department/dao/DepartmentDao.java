package moka.department.dao;

import org.springframework.stereotype.Repository;

import moka.basic.dao.BasicDao;
import moka.department.bo.Department;
import moka.department.to.DepartmentTo;

@Repository("departmentDao")
public interface DepartmentDao extends BasicDao<Department, DepartmentTo> {

}
