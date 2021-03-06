package moka.menu.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 菜单实体
 * Created by moka on 2017/3/5 0005.
 */
@Entity
@Table(name = "t_menu")
public class Menu extends IdEntity implements Serializable {
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 菜单路由
     */
    private String link;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 父级id
     */
    private String parentId;

    /**
     * 是否是最顶目录
     */
    private int isRoot;

    /**
     * 菜单类型
     */
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(int isRoot) {
        this.isRoot = isRoot;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}