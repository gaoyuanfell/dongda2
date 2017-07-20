package moka.salesPlan.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import moka.basic.bo.IdEntity;

/**
 * 销售计划实体
 */
@Entity
@Table(name = "SalesPlan")
public class SalesPlan extends IdEntity implements Serializable {
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
}
