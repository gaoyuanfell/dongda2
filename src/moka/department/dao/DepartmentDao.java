package moka.department.dao;

import moka.basic.dao.BasicDao;
import moka.department.bo.Department;
import moka.department.to.DepartmentTo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("departmentDao")
public interface DepartmentDao extends BasicDao<Department, DepartmentTo> {
    List<DepartmentTo> findByCompanyId(String companyId);
}
