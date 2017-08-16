package moka.address.vo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_district")
public class DistrictVo extends IdEntity implements Serializable {
    /**
     * 名称
     */
    private String name;
    /**
     * 父ID
     */
    private String parentId;
    /**
     * 字母开头单词
     */
    private String initial;
    /**
     * 名称全拼
     */
    private String pinyin;
    /**
     * 附加信息
     */
    private String extra;
    /**
     * 后缀
     */
    private String suffix;
    /**
     * 邮编
     */
    private String code;
    /**
     * 地区编码
     */
    private String areaCode;
    /**
     * 排序
     */
    private String order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
