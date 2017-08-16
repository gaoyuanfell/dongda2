package moka.auth.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_auth")
public class Auth extends IdEntity implements Serializable {
    /**
     * 权限标志
     */
    private String sign;
    /**
     * 权限名称
     */
    private String name;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
