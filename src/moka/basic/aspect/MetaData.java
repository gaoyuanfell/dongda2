package moka.basic.aspect;


import java.util.List;

/**
 * 通过注解自动向controller参数填充有关sql查询的数据，不必每次都写，
 * 用法  @MetaDataSecurity(value = {"companyIds","followUserIds"}) MetaData metaData
 */
public class MetaData {
    private List companyIds;

    public List getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(List companyIds) {
        this.companyIds = companyIds;
    }

    private int followUserIds;

    public int getFollowUserIds() {
        return followUserIds;
    }

    public void setFollowUserIds(int followUserIds) {
        this.followUserIds = followUserIds;
    }
}
