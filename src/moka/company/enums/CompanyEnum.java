package moka.company.enums;

import org.jetbrains.annotations.Contract;

public enum CompanyEnum {
    inside("内部公司","1"),
    external("外部公司","2"),
    adminInside("申请管理中","1"),
    ;
    private String name;
    private String value;

    CompanyEnum(String name, String value) {
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