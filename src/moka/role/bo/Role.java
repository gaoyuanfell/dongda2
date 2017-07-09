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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}