package moka.role.to;

import java.io.Serializable;
import java.util.Date;

/**
 * 返回数据
 * Created by moka on 2017/3/5 0005.
 */
public class RoleTo implements Serializable {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 资源ID
     */
    private String applicationId;

    private String[] menus;

    private String menuStr;
    /**
     * 1 可以修改 2不能删除和修改
     */
    private String readOnly;

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }
    public String[] getMenus() {
        return menus;
    }

    public void setMenus(String[] menus) {
        this.menus = menus;
    }

    public String getMenuStr() {
        return menuStr;
    }

    public void setMenuStr(String menuStr) {
        this.menuStr = menuStr;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
