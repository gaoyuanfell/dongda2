package moka.department.service;

import moka.basic.service.BasicService;
import moka.department.bo.Department;

public interface DepartmentService extends BasicService{

    String insert(Department department);

}
