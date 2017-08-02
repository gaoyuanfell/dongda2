package moka.customer.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**公司实体
 * Created by moka on 2017/3/5 0005.
 */
@Entity
@Table(name = "t_customer")
public class Customer extends IdEntity implements Serializable {

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

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}