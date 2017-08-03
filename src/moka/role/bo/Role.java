package moka.role.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**角色实体
 * Created by moka on 2017/3/5 0005.
 */
@Entity
@Table(name = "role")
public class Role extends IdEntity implements Serializable {
    /**
     * 角色名称
     */
    private String name;
    /**
     * 资源ID
     */
    private String applicationId;

    /**
     * 1 可以修改 2不能删除和修改 3不可查看
     */
    private String readOnly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }
}