package moka.user.vo;

import moka.basic.page.Page;

import java.util.Date;
import java.util.List;

/**
 * 接收应用层的数据
 * Created by moka on 2017/3/5 0005.
 */
public class UserVo extends Page {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;
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
    private Integer companyId;

    /**
     * 资源ID
     */
    private String applicationId;

    /**
     * 角色数组
     */
    private List<Integer> roles;

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
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