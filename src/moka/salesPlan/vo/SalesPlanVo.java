package moka.salesPlan.vo;

import java.math.BigDecimal;
import java.util.Date;

import moka.basic.page.Page;

public class SalesPlanVo extends Page {
    private int id;
    private Date createDate;
    private Date updateDate;
    private int state;

    /**
     * 买方公司ID
     */
    private int buyComId;
    /**
     * 买方联系人ID
     */
    private int comContactsId;
    /**
     * 合同名称
     */
    private String contractName;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 计划签订金额
     */
    private BigDecimal amt;
    /**
     * 添加计划员工ID
     */
    private int userId;
    /**
     * 所属公司
     */
    private int comId;
    /**
     * 计划签订时间
     */
    private Date signDate;
    /**
     * 买方公司名称
     */
    private String buyComName;
    /**
     * 买方联系人名称
     */
    private String comContactsName;

    public int getBuyComId() {
        return buyComId;
    }

    public void setBuyComId(int buyComId) {
        this.buyComId = buyComId;
    }

    public int getComContactsId() {
        return comContactsId;
    }

    public void setComContactsId(int comContactsId) {
        this.comContactsId = comContactsId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getComId() {
        return comId;
    }

    public void setComId(int comId) {
        this.comId = comId;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
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

    public String getBuyComName() {
        return buyComName;
    }

    public void setBuyComName(String buyComName) {
        this.buyComName = buyComName;
    }

    public String getComContactsName() {
        return comContactsName;
    }

    public void setComContactsName(String comContactsName) {
        this.comContactsName = comContactsName;
    }

}
