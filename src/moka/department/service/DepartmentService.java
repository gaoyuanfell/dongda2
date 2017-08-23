package moka.department.service;

import moka.basic.service.BasicService;
import moka.department.bo.Department;
import moka.department.to.DepartmentTo;

import java.util.List;

public interface DepartmentService extends BasicService{

    String insert(Department department);

    /**
     * 根据公司ID获取部门结构
     * @param companyId
     * @return
     */
    List<DepartmentTo> findByCompanyId(String companyId);
}
