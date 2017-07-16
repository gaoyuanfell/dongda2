package moka.menu.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 返回数据
 * Created by moka on 2017/3/5 0005.
 */
public class MenuTo implements Serializable {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;

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
    private int parentId;

    /**
     * 是否是最顶目录
     */
    private int isRoot;

    /**
     * 菜单类型
     */
    private String type;

    private List<MenuTo> childList = new ArrayList<>();

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MenuTo> getChildList() {
        return childList;
    }

    public void setChildList(List<MenuTo> childList) {
        this.childList = childList;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
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
