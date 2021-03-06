package moka.customer.to;

import moka.address.to.AddressTo;
import moka.company.to.CompanyTo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 返回数据
 * Created by moka on 2017/3/5 0005.
 */
public class CustomerTo implements Serializable {
    private String id;
    private Date createDate;
    private Date updateDate;
    private int state;
    /**
     * 客户名称
     */
    private String name;
    /**
     * 客户所属公司
     */
    private String companyId;
    /**
     * 客户生日
     */
    private Date birthday;
    /**
     * 客户性别
     */
    private String sex;
    /**
     * 客户联系地址
     */
    private String contactAddress;
    /**
     * 客户联系电话
     */
    private String contactTel;
    /**
     * 客户职位
     */
    private String jobLevel;
    /**
     * 客户邮箱
     */
    private String email;

    /**
     * 资源ID
     */
    private String applicationId;

    /**
     * 公司信息
     */
    private CompanyTo company;
    /**
     * 收货地址集合
     */
    private List<AddressTo> addressList;

    public CompanyTo getCompany() {
        return company;
    }

    public void setCompany(CompanyTo company) {
        this.company = company;
    }

    public List<AddressTo> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<AddressTo> addressList) {
        this.addressList = addressList;
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
