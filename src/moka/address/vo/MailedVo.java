package moka.address.vo;

import moka.basic.page.Page;

import java.util.Date;

public class MailedVo extends Page {
    private String id;
    private Date createDate;
    private Date updateDate;
    private int state;

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
