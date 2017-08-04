package moka.basic.aspect;


import java.util.List;

/**
 * 通过注解自动向controller参数填充有关sql查询的数据，不必每次都写，
 * 用法  @MetaDataSecurity(value = {"companyIds","followUserIds"}) MetaData metaData
 */
public class MetaData {
    /**
     * 用户所在公司ID
     */
    private List companyIds;

    public List getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(List companyIds) {
        this.companyIds = companyIds;
    }
    /**
     * 用户直属下级ID
     */
    private List<String> lowerIds;

    public List<String> getLowerIds() {
        return lowerIds;
    }

    public void setLowerIds(List<String> lowerIds) {
        this.lowerIds = lowerIds;
    }
}
