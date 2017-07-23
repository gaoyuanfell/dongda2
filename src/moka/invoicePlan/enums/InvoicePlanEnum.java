package moka.invoicePlan.enums;

import org.jetbrains.annotations.Contract;

public enum InvoicePlanEnum {
    initial("初始状态","1"),
    ;
    private String name;
    private String value;

    InvoicePlanEnum(String name, String value) {
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