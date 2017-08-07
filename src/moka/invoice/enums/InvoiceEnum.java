package moka.invoice.enums;

import org.jetbrains.annotations.Contract;

public enum InvoiceEnum {
    preparation("准备中","1"),
    invoiced("已开票","2"),
    mailed("已寄送","3"),
    received("已收到","4"),
    credited("已入账","5"),
    ;
    private String name;
    private String value;

    InvoiceEnum(String name, String value) {
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