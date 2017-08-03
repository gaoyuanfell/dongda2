package moka.user.to;

import moka.company.to.CompanyTo;
import moka.menu.to.MenuTo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 返回数据
 * Created by moka on 2017/3/5 0005.
 */
public class UserTo implements Serializable {
    private String id;
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
    private String companyId;

    /**
     * 资源ID
     */
    private String applicationId;
    /**
     * 菜单
     */
    private MenuTo menuTo;

    /**
     * 角色集合
     */
    private List roles;
    /**
     * 所在公司集合
     */
    private List<CompanyTo> companies;
    /**
     * 1 可以修改 2不能删除和修改 3不可查看
     */
    private String readOnly;
    /**
     * 下级用户ID集合
     */
    private List<String> lowerIds;
    /**
     * 下级用户集合
     */
    private List<UserTo> lowers;
    /**
     * 部门ID
     */
    private String departmentId;
    /**
     * 部门名称
     */
    private String departmentName;

    public List<UserTo> getLowers() {
        return lowers;
    }

    public void setLowers(List<UserTo> lowers) {
        this.lowers = lowers;
    }

    public List<String> getLowerIds() {
        return lowerIds;
    }

    public void setLowerIds(List<String> lowerIds) {
        this.lowerIds = lowerIds;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public MenuTo getMenuTo() {
        return menuTo;
    }

    public void setMenuTo(MenuTo menuTo) {
        this.menuTo = menuTo;
    }

    public List getRoles() {
        return roles;
    }

    public void setRoles(List roles) {
        this.roles = roles;
    }

    public List<CompanyTo> getCompanies() {
        return companies;
    }

    public void setCompanies(List<CompanyTo> companies) {
        this.companies = companies;
    }

    public String getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(String readOnly) {
        this.readOnly = readOnly;
    }
}
