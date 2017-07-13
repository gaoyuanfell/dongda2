package moka.user.bo;

import moka.basic.bo.IdEntity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**用户实体
 * Created by moka on 2017/3/5 0005.
 */
@Entity
@Table(name = "user")
public class User extends IdEntity implements Serializable {
    /**
     * 姓名
     */
    private String name;
    /**
     * 联系电话
     */
    private String phoneNumber;
    /**
     * 邮箱
     */
    private String mail;
    /**
     * 登录密码
     */
    private String password;
    /**
     * 员工编号
     */
    private String employeeNo;
    /**
     * 现住地址
     */
    private String currAddress;
    /**
     * 家庭住址
     */
    private String homeAdress;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 身份证号码
     */
    private String idCardNo;
    /**
     * 公司ID
     */
    private String companyId;

    /**
     * 资源ID
     */
    private String applicationId;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getCurrAddress() {
        return currAddress;
    }

    public void setCurrAddress(String currAddress) {
        this.currAddress = currAddress;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }
}