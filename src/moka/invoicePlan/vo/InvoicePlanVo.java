package moka.invoicePlan.vo;

import java.math.BigDecimal;
import java.util.Date;

public class InvoicePlanVo {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;
    /**
     * 合同ID
     */
    private int contractId;
    /**
     * 计划开票次数
     */
    private int paymentPlan;
    /**
     * 本次开票次数
     */
    private int paymentPlanFact;
    /**
     * 版本号
     */
    private int versionNo;
    /**
     * 开票金额
     */
    private BigDecimal amt;
    /**
     * 计划开票日期
     */
    private Date planDate;
    /**
     * 预计收款日期
     */
    private Date planReceiveDate;
    /**
     * 已入账金额
     */
    private BigDecimal receiveAmt;
    /**
     * 状态
     */
    public int getContractId() {
        return contractId;
    }
    public void setContractId(int contractId) {
        this.contractId = contractId;
    }
    public int getPaymentPlan() {
        return paymentPlan;
    }
    public void setPaymentPlan(int paymentPlan) {
        this.paymentPlan = paymentPlan;
    }
    public int getPaymentPlanFact() {
        return paymentPlanFact;
    }
    public void setPaymentPlanFact(int paymentPlanFact) {
        this.paymentPlanFact = paymentPlanFact;
    }
    public int getVersionNo() {
        return versionNo;
    }
    public void setVersionNo(int versionNo) {
        this.versionNo = versionNo;
    }
    public BigDecimal getAmt() {
        return amt;
    }
    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }
    public Date getPlanDate() {
        return planDate;
    }
    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }
    public Date getPlanReceiveDate() {
        return planReceiveDate;
    }
    public void setPlanReceiveDate(Date planReceiveDate) {
        this.planReceiveDate = planReceiveDate;
    }
    public BigDecimal getReceiveAmt() {
        return receiveAmt;
    }
    public void setReceiveAmt(BigDecimal receiveAmt) {
        this.receiveAmt = receiveAmt;
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

}
