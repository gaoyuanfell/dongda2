package moka.contract.vo;

import moka.basic.page.Page;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 合同实体
 */
public class ContractVo extends Page {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;
    /**
     * 合同编号
     */
    private int contractId;
    /**
     * 合同号
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
    private int companyContarctIdC;
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
    private int paymentPlan;


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



    public int getCompanyIdB() {
        return companyIdB;
    }

    public void setCompanyIdB(int companyIdB) {
        this.companyIdB = companyIdB;
    }



    public int getCompanyIdC() {
        return companyIdC;
    }

    public void setCompanyIdC(int companyIdC) {
        this.companyIdC = companyIdC;
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

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

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

    public int getCompanyContractIdB() {
        return companyContractIdB;
    }

    public void setCompanyContractIdB(int companyContractIdB) {
        this.companyContractIdB = companyContractIdB;
    }

    public int getCompanyContractIdA() {
        return companyContractIdA;
    }

    public void setCompanyContractIdA(int companyContractIdA) {
        this.companyContractIdA = companyContractIdA;
    }

    public int getCompanyContarctIdC() {
        return companyContarctIdC;
    }

    public void setCompanyContarctIdC(int companyContarctIdC) {
        this.companyContarctIdC = companyContarctIdC;
    }
}
