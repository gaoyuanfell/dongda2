package moka.invoice.vo;

import moka.basic.page.Page;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class InvoiceVo extends Page {
    private String id;
    private Date createDate;
    private Date updateDate;
    private int state;
    /**
     * 合同编号
     */
    private String contractId;
    /**
     * 开票批次ID
     */
    private String invoicePlanId;
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
    private BigDecimal amtTax;
    /**
     * 备注
     */
    private String remark;
    /**
     * 发票状态
     */
    private String invoiceState;
    /**
     * 资源ID
     */
    private String applicationId;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 不含税金额
     */
    private BigDecimal planAmt;
    /**
     * 下级用户ID集合
     */
    private List<String> lowerIds;

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public List<String> getLowerIds() {
        return lowerIds;
    }

    public void setLowerIds(List<String> lowerIds) {
        this.lowerIds = lowerIds;
    }

    public BigDecimal getPlanAmt() {
        return planAmt;
    }

    public void setPlanAmt(BigDecimal planAmt) {
        this.planAmt = planAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
    public String getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(String invoiceState) {
        this.invoiceState = invoiceState;
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

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getInvoicePlanId() {
        return invoicePlanId;
    }

    public void setInvoicePlanId(String invoicePlanId) {
        this.invoicePlanId = invoicePlanId;
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

    public BigDecimal getAmtTax() {
        return amtTax;
    }

    public void setAmtTax(BigDecimal amtTax) {
        this.amtTax = amtTax;
    }
}
