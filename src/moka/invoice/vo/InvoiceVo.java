package moka.invoice.vo;

import java.math.BigDecimal;
import java.util.Date;

public class InvoiceVo {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;
    /**
     * 合同编号
     */
    private int contractId;
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
    private Date factIncoiveDate;
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
    private int companyPayId;
    /**
     * 销售方公司ID
     */
    private int companySaleId;
    /**
     * 收款人姓名
     */
    private String payeeName;
    /**
     * 复核人姓名
     */
    private String checkName;
    /**
     * 开票人姓名
     */
    private String billingName;
    /**
     * 不含税金额
     */
    private BigDecimal amtWithoutTax;
    /**
     * 税率
     */
    private Double rate;
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
    private String remaeks;

    public int getPaymentPlanFact() {
        return paymentPlanFact;
    }
    public void setPaymentPlanFact(int paymentPlanFact) {
        this.paymentPlanFact = paymentPlanFact;
    }
    public Date getFactIncoiveDate() {
        return factIncoiveDate;
    }
    public void setFactIncoiveDate(Date factIncoiveDate) {
        this.factIncoiveDate = factIncoiveDate;
    }
    public Date getPlanInvoiceDate() {
        return planInvoiceDate;
    }
    public void setPlanInvoiceDate(Date planInvoiceDate) {
        this.planInvoiceDate = planInvoiceDate;
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
    public int getCompanyPayId() {
        return companyPayId;
    }
    public void setCompanyPayId(int companyPayId) {
        this.companyPayId = companyPayId;
    }
    public int getCompanySaleId() {
        return companySaleId;
    }
    public void setCompanySaleId(int companySaleId) {
        this.companySaleId = companySaleId;
    }
    public String getPayeeName() {
        return payeeName;
    }
    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }
    public String getCheckName() {
        return checkName;
    }
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }
    public String getBillingName() {
        return billingName;
    }
    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }
    public BigDecimal getAmtWithoutTax() {
        return amtWithoutTax;
    }
    public void setAmtWithoutTax(BigDecimal amtWithoutTax) {
        this.amtWithoutTax = amtWithoutTax;
    }
    public Double getRate() {
        return rate;
    }
    public void setRate(Double rate) {
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
    public String getRemaeks() {
        return remaeks;
    }
    public void setRemaeks(String remaeks) {
        this.remaeks = remaeks;
    }
    public int getContractId() {
        return contractId;
    }
    public void setContractId(int contractId) {
        this.contractId = contractId;
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