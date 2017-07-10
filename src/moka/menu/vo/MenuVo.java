package moka.menu.vo;

import moka.basic.page.Page;

import java.util.Date;

/**
 * 接收应用层的数据
 * Created by moka on 2017/3/5 0005.
 */
public class MenuVo extends Page {
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
    private int type;

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}