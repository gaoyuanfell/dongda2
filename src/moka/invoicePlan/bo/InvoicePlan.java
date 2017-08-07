package moka.invoicePlan.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 开票计划实体
 */
@Entity
@Table(name = "InvoicePlan")
public class InvoicePlan extends IdEntity implements Serializable {
    /**
     * 合同ID
     */
    private int contractId;
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

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getPlanState() {
        return planState;
    }

    public void setPlanState(String planState) {
        this.planState = planState;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
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
}
