package moka.company.vo;

import moka.basic.page.Page;

import java.util.Date;

/**
 * 接收应用层的数据
 * Created by moka on 2017/3/5 0005.
 */
public class CompanyVo extends Page {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;

    /**
     * 注册号
     */
    private String companyCode;
    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 公司开户行
     */
    private String companyBank;
    /**
     * 公司电话
     */
    private String companyTel;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 公司邮件
     */
    private String companyEmail;

    /**
     * 公司纳税识别号
     */
    private String taxCode;

    /**
     * 企业类型
     */
    private String companyType;

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

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBank() {
        return companyBank;
    }

    public void setCompanyBank(String companyBank) {
        this.companyBank = companyBank;
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
}