package moka.company.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**公司实体
 * Created by moka on 2017/3/5 0005.
 */
@Entity
@Table(name = "company")
public class Company extends IdEntity implements Serializable {
    /**
     * 注册号
     */
    private String companyCode;
    /**
     * 公司名称
     */
    private String companyName;
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
     * 注册资金
     */
    private String regCapital;
    /**
     * 法人代表
     */
    private String corporateName;
    /**
     * 经营期限
     */
    private Integer operatingPeriod;
    /**
     * 企业类型
     */
    private String companyType;
    /**
     * 登记机关
     */
    private String registrationAuthority;
    /**
     * 成立时间
     */
    private Date companyDate;

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

    public String getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(String regCapital) {
        this.regCapital = regCapital;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public Integer getOperatingPeriod() {
        return operatingPeriod;
    }

    public void setOperatingPeriod(Integer operatingPeriod) {
        this.operatingPeriod = operatingPeriod;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getRegistrationAuthority() {
        return registrationAuthority;
    }

    public void setRegistrationAuthority(String registrationAuthority) {
        this.registrationAuthority = registrationAuthority;
    }

    public Date getCompanyDate() {
        return companyDate;
    }

    public void setCompanyDate(Date companyDate) {
        this.companyDate = companyDate;
    }
}