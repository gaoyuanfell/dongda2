package moka.invoice.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 发票实体
 * @author wry
 *
 */
@Entity
@Table(name="Invoice")
public class Invoice extends IdEntity implements Serializable{
    /**
     * 合同编号
     */
    private String contractId;
    /**
     * 实际开票批次
     */
    private int paymentPlanFact;
    /**
     * 计划开票日期
     */
    private Date planInvoiceDate;
    /**
     * 实际开票日期
     */
    private Date factInvoiceDate;
    /**
     * 预计付款日期
     */
    private Date planPaymentDate;
    /**
     * 实际付款日期
     */
    private Date factPaymentDate;
    /**
     * 购买方公司ID
     */
    private String companyPayId;
    /**
     * 销售方公司ID
     */
    private String companySaleId;
    /**
     * 收款人姓名
     */
    private String payeeName;
    /**
     * 收款人ID
     */
    private String payeeId;
    /**
     * 复核人姓名
     */
    private String checkName;
    /**
     * 复核人ID
     */
    private String checkId;
    /**
     * 开票人姓名
     */
    private String billingName;
    /**
     * 开票人ID
     */
    private String billingId;
    /**
     * 不含税金额
     */
    private BigDecimal amtWithoutTax;
    /**
     * 税率
     */
    private BigDecimal rate;
    /**
     * 税额
     */
    private BigDecimal amtOfTax;
    /**
     * 价税金额
     */
    private BigDecimal amt;
    /**
     * 备注
     */
    private String remarks;

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

    public Date getPlanInvoiceDate() {
        return planInvoiceDate;
    }

    public void setPlanInvoiceDate(Date planInvoiceDate) {
        this.planInvoiceDate = planInvoiceDate;
    }

    public Date getFactInvoiceDate() {
        return factInvoiceDate;
    }

    public void setFactInvoiceDate(Date factInvoiceDate) {
        this.factInvoiceDate = factInvoiceDate;
    }

    public Date getPlanPaymentDate() {
        return planPaymentDate;
    }

    public void setPlanPaymentDate(Date planPaymentDate) {
        this.planPaymentDate = planPaymentDate;
    }

    public Date getFactPaymentDate() {
        return factPaymentDate;
    }

    public void setFactPaymentDate(Date factPaymentDate) {
        this.factPaymentDate = factPaymentDate;
    }

    public String getCompanyPayId() {
        return companyPayId;
    }

    public void setCompanyPayId(String companyPayId) {
        this.companyPayId = companyPayId;
    }

    public String getCompanySaleId() {
        return companySaleId;
    }

    public void setCompanySaleId(String companySaleId) {
        this.companySaleId = companySaleId;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public String getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(String payeeId) {
        this.payeeId = payeeId;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public String getBillingName() {
        return billingName;
    }

    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }

    public String getBillingId() {
        return billingId;
    }

    public void setBillingId(String billingId) {
        this.billingId = billingId;
    }

    public BigDecimal getAmtWithoutTax() {
        return amtWithoutTax;
    }

    public void setAmtWithoutTax(BigDecimal amtWithoutTax) {
        this.amtWithoutTax = amtWithoutTax;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getAmtOfTax() {
        return amtOfTax;
    }

    public void setAmtOfTax(BigDecimal amtOfTax) {
        this.amtOfTax = amtOfTax;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
