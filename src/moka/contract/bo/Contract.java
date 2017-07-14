package moka.contract.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 合同实体
 */
@Entity
@Table(name = "Contract")
public class Contract extends IdEntity implements Serializable {
    /**
     * 合同编号
     */
    private int contactId;
    /**
     * 合同号
     */
    private String contactNo;
    /**
     * 版本号
     */
    private int versionNo;
    /**
     * 甲方公司ID
     */
    private int companyIdA;
    /**
     * 甲方联系人ID
     */
    private int companyContactIdA;
    /**
     * 乙方公司ID
     */
    private int companyIdB;
    /**
     * 乙方联系人ID
     */
    private int companyContactIdB;
    /**
     * 丙方公司ID
     */
    private int companyIdC;
    /**
     * 丙方联系人ID
     */
    private int companyContactIdC;
    /**
     * 合同签订日期
     */
    private Date signDate;
    /**
     * 合同生效日期
     */
    private Date startDate;
    /**
     * 合同结束日期
     */
    private Date endDate;
    /**
     * 项目名称
     */
    private String itemName;
    /**
     * 货物或服务名称
     */
    private String item;
    /**
     * 合同金额
     */
    private BigDecimal amt;
    public String getContactNo() {
        return contactNo;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public int getVersionNo() {
        return versionNo;
    }
    public void setVersionNo(int versionNo) {
        this.versionNo = versionNo;
    }
    public int getCompanyIdA() {
        return companyIdA;
    }
    public void setCompanyIdA(int companyIdA) {
        this.companyIdA = companyIdA;
    }
    public int getCompanyContactIdA() {
        return companyContactIdA;
    }
    public void setCompanyContactIdA(int companyContactIdA) {
        this.companyContactIdA = companyContactIdA;
    }
    public int getCompanyIdB() {
        return companyIdB;
    }
    public void setCompanyIdB(int companyIdB) {
        this.companyIdB = companyIdB;
    }
    public int getCompanyContactIdB() {
        return companyContactIdB;
    }
    public void setCompanyContactIdB(int companyContactIdB) {
        this.companyContactIdB = companyContactIdB;
    }
    public int getCompanyIdC() {
        return companyIdC;
    }
    public void setCompanyIdC(int companyIdC) {
        this.companyIdC = companyIdC;
    }
    public int getCompanyContactIdC() {
        return companyContactIdC;
    }
    public void setCompanyContactIdC(int companyContactIdC) {
        this.companyContactIdC = companyContactIdC;
    }
    public Date getSignDate() {
        return signDate;
    }
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public BigDecimal getAmt() {
        return amt;
    }
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }
    public int getContactId() {
        return contactId;
    }
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }
}