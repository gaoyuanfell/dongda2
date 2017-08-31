package moka.contract.to;

import moka.goods.to.GoodsTo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ContractTo {
    private String id;
    private Date createDate;
    private Date updateDate;
    private int state;

    /**
     * 合同号
     */
    private String contractNo;
    /**
     * 版本号
     */
    private int versionNo;


    private String companyIdA;

    private String companyContractIdA;

    private String companyIdB;

    private String companyContractIdB;

    /**
     * 甲方公司ID
     */
    private String companyPayId;
    /**
     * 甲方联系人ID
     */
    private String companyPayCustomerId;
    /**
     * 乙方公司ID
     */
    private String companySaleId;
    /**
     * 乙方联系人ID 销售
     */
    private String companySaleUserId;
    /**
     * 丙方公司ID
     */
    private String companyIdC;
    /**
     * 丙方联系人ID
     */
    private String companyContractIdC;
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


    /**
     * 开票计划
     */
    private List invoicePlans;
    /**
     * 甲公司名称
     */
    private String companyPayName;
    /**
     * 乙公司名称
     */
    private String companySaleName;
    /**
     * 甲公司客户
     */
    private String companyPayCustomerName;
    /**
     * 销售
     */
    private String companySaleUserName;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 创建人名称
     */
    private String userName;
    /**
     * 物品集合
     */
    private List<GoodsTo> goodsList;

    /**
     * 已付款期数
     */
    private int hasPaymentNum;
    /**
     * 已收款总金额 税后
     */
    private BigDecimal amtTaxTotal;
    /**
     * 已收款总金额 税前
     */
    private BigDecimal planAmtTotal;

    public int getHasPaymentNum() {
        return hasPaymentNum;
    }

    public void setHasPaymentNum(int hasPaymentNum) {
        this.hasPaymentNum = hasPaymentNum;
    }

    public BigDecimal getAmtTaxTotal() {
        return amtTaxTotal;
    }

    public void setAmtTaxTotal(BigDecimal amtTaxTotal) {
        this.amtTaxTotal = amtTaxTotal;
    }

    public BigDecimal getPlanAmtTotal() {
        return planAmtTotal;
    }

    public void setPlanAmtTotal(BigDecimal planAmtTotal) {
        this.planAmtTotal = planAmtTotal;
    }

    public List<GoodsTo> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsTo> goodsList) {
        this.goodsList = goodsList;
    }

    public String getCompanyPayName() {
        return companyPayName;
    }

    public void setCompanyPayName(String companyPayName) {
        this.companyPayName = companyPayName;
    }

    public String getCompanySaleName() {
        return companySaleName;
    }

    public void setCompanySaleName(String companySaleName) {
        this.companySaleName = companySaleName;
    }

    public String getCompanyPayCustomerName() {
        return companyPayCustomerName;
    }

    public void setCompanyPayCustomerName(String companyPayCustomerName) {
        this.companyPayCustomerName = companyPayCustomerName;
    }

    public String getCompanySaleUserName() {
        return companySaleUserName;
    }

    public void setCompanySaleUserName(String companySaleUserName) {
        this.companySaleUserName = companySaleUserName;
    }

    public String getCompanyPayId() {
        return companyPayId;
    }

    public void setCompanyPayId(String companyPayId) {
        this.companyPayId = companyPayId;
    }

    public String getCompanyPayCustomerId() {
        return companyPayCustomerId;
    }

    public void setCompanyPayCustomerId(String companyPayCustomerId) {
        this.companyPayCustomerId = companyPayCustomerId;
    }

    public String getCompanySaleId() {
        return companySaleId;
    }

    public void setCompanySaleId(String companySaleId) {
        this.companySaleId = companySaleId;
    }

    public String getCompanySaleUserId() {
        return companySaleUserId;
    }

    public void setCompanySaleUserId(String companySaleUserId) {
        this.companySaleUserId = companySaleUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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

    public String getCompanyIdA() {
        return companyIdA;
    }

    public void setCompanyIdA(String companyIdA) {
        this.companyIdA = companyIdA;
    }

    public String getCompanyContractIdA() {
        return companyContractIdA;
    }

    public void setCompanyContractIdA(String companyContractIdA) {
        this.companyContractIdA = companyContractIdA;
    }

    public String getCompanyIdB() {
        return companyIdB;
    }

    public void setCompanyIdB(String companyIdB) {
        this.companyIdB = companyIdB;
    }

    public String getCompanyContractIdB() {
        return companyContractIdB;
    }

    public void setCompanyContractIdB(String companyContractIdB) {
        this.companyContractIdB = companyContractIdB;
    }

    public String getCompanyIdC() {
        return companyIdC;
    }

    public void setCompanyIdC(String companyIdC) {
        this.companyIdC = companyIdC;
    }

    public String getCompanyContractIdC() {
        return companyContractIdC;
    }

    public void setCompanyContractIdC(String companyContractIdC) {
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

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactState() {
        return contactState;
    }

    public void setContactState(String contactState) {
        this.contactState = contactState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPaymentNum() {
        return paymentNum;
    }

    public void setPaymentNum(int paymentNum) {
        this.paymentNum = paymentNum;
    }

    public List getInvoicePlans() {
        return invoicePlans;
    }

    public void setInvoicePlans(List invoicePlans) {
        this.invoicePlans = invoicePlans;
    }
}
