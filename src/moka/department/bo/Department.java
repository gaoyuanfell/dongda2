package moka.department.bo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import moka.basic.bo.IdEntity;

/**
 * 部门实体
 */
@Entity
@Table(name = "department")
public class Department extends IdEntity implements Serializable {
    /**
     * 部门名称
     */
    private String name;
    /**
     * 所属公司ID
     */
    private String companyId;
    /**
     * 职位
     */
    private String position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
