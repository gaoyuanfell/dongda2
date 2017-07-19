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
    private String contractNo;
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
    private int companyContractIdA;
    /**
     * 乙方公司ID
     */
    private int companyIdB;
    /**
     * 乙方联系人ID
     */
    private int companyContractIdB;
    /**
     * 丙方公司ID
     */
    private int companyIdC;
    /**
     * 丙方联系人ID
     */
    private int companyContractIdC;
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
     * 产品和服务
     */
    private String item;
    /**
     * 合同金额
     */
    private BigDecimal amt;

    /**
     * 资源ID
     */
    private String applicationId;
    /**
     * 合同类型
     */
    private String contactType;
    /**
     * 合同状态
     */
    private String contactState;
    /**
     * 备注
     */
    private String remark;
    /**
     * 付款期数
     */
    private int paymentNum;

    public int getPaymentNum() {
        return paymentNum;
    }

    public void setPaymentNum(int paymentNum) {
        this.paymentNum = paymentNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContactState() {
        return contactState;
    }

    public void setContactState(String contactState) {
        this.contactState = contactState;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
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

    public int getCompanyContractIdA() {
        return companyContractIdA;
    }

    public void setCompanyContractIdA(int companyContractIdA) {
        this.companyContractIdA = companyContractIdA;
    }

    public int getCompanyIdB() {
        return companyIdB;
    }

    public void setCompanyIdB(int companyIdB) {
        this.companyIdB = companyIdB;
    }

    public int getCompanyContractIdB() {
        return companyContractIdB;
    }

    public void setCompanyContractIdB(int companyContractIdB) {
        this.companyContractIdB = companyContractIdB;
    }

    public int getCompanyIdC() {
        return companyIdC;
    }

    public void setCompanyIdC(int companyIdC) {
        this.companyIdC = companyIdC;
    }

    public int getCompanyContractIdC() {
        return companyContractIdC;
    }

    public void setCompanyContractIdC(int companyContractIdC) {
        this.companyContractIdC = companyContractIdC;
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
}
