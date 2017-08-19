package moka.address.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="t_mailed")
public class Mailed extends IdEntity implements Serializable {
    /**
     * 发票ID
     */
    private String invoiceId;
    /**
     * 收货地址
     */
    private String address;
    /**
     * 收货联系人电话
     */
    private String phone;
    /**
     * 收货人
     */
    private String nickname;
    /**
     * 快递单号
     */
    private String mailedNo;
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
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMailedNo() {
        return mailedNo;
    }

    public void setMailedNo(String mailedNo) {
        this.mailedNo = mailedNo;
    }
}
