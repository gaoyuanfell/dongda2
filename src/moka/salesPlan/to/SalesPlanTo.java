package moka.salesPlan.to;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SalesPlanTo implements Serializable {
    private Integer id;
    private Date createDate;
    private Date updateDate;
    private Integer state;

    /**
     * 买方公司ID
     */
    private Integer buyComId;
    /**
     * 买方联系人ID
     */
    private Integer comContactsId;
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
    private Integer userId;
    /**
     * 所属公司
     */
    private Integer comId;
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

    public Integer getBuyComId() {
        return buyComId;
    }

    public void setBuyComId(Integer buyComId) {
        this.buyComId = buyComId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
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

    public Integer getComContactsId() {
        return comContactsId;
    }

    public void setComContactsId(Integer comContactsId) {
        this.comContactsId = comContactsId;
    }
}
