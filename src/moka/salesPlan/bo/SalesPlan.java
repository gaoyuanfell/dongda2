package moka.salesPlan.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 销售计划实体
 */
@Entity
@Table(name = "t_sales_plan")
public class SalesPlan extends IdEntity implements Serializable {
    /**
     * 买方公司ID
     */
    private String buyComId;
    /**
     * 买方联系人ID
     */
    private String comContactsId;
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
    private String userId;
    /**
     * 所属公司
     */
    private String comId;
    /**
     * 计划签订时间
     */
    private Date signDate;

    public String getBuyComId() {
        return buyComId;
    }

    public void setBuyComId(String buyComId) {
        this.buyComId = buyComId;
    }

    public String getComContactsId() {
        return comContactsId;
    }

    public void setComContactsId(String comContactsId) {
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
}
