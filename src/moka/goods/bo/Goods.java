package moka.goods.bo;

import moka.basic.bo.IdEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="t_goods")
public class Goods extends IdEntity implements Serializable {
    /**
     * 合同ID
     */
    private String contractId;
    /**
     * 发票编号ID
     */
    private String invoiceId;
    /**
     * 货物名称
     */
    private String name;
    /**
     * 货物数量
     */
    private int quantity;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 规格型号
     */
    private String specification;
    /**
     * 不含税金额
     */
    private BigDecimal amt;
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

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
