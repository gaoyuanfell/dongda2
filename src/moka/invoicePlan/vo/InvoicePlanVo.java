package moka.invoicePlan.vo;

import moka.basic.page.Page;

import java.math.BigDecimal;
import java.util.Date;

public class InvoicePlanVo extends Page{
    private String id;
    private Date createDate;
    private Date updateDate;
    private int state;
    /**
     * 合同ID
     */
    private String contractId;
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
    private BigDecimal planAmt = new BigDecimal("0");
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
    private BigDecimal receiveAmt = new BigDecimal("0");
    /**
     * 状态
     */
    private String planState;
    /**
     * 资源ID
     */
    private String applicationId;

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

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
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

    public BigDecimal getPlanAmt() {
        return planAmt;
    }

    public void setPlanAmt(BigDecimal planAmt) {
        this.planAmt = planAmt;
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

    public String getPlanState() {
        return planState;
    }

    public void setPlanState(String planState) {
        this.planState = planState;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
