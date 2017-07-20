package moka.contract.enums;

public enum ContractEnum{
    initial("初始状态","1"),
    inAudit("审核中","2"),
    audited("审核通过","3"),
    notAudit("审核不通过","4"),
    ;
    private String name;
    private String value;

    ContractEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}