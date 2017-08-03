package moka.contract.enums;

import org.jetbrains.annotations.Contract;

public enum ContractEnum{
    initial("初始状态-待审核","1"),
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

    @Contract(pure = true)
    public String getName() {
        return name;
    }

    @Contract(pure = true)
    public String getValue() {
        return value;
    }
}