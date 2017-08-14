package moka.invoicePlan.enums;

import org.jetbrains.annotations.Contract;

public enum InvoicePlanEnum {
    undone("未完成","1"),
    completed("已完成","2"),
    invoiced("已开票","3"),
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