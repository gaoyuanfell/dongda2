package moka.invoice.enums;

import org.jetbrains.annotations.Contract;

public enum InvoiceEnum {
    preparation("准备中","1"),
    already("已开据","2"),
    invoiced("已开票","3"),
    mailed("已寄送","4"),
    received("已收到","5"),
    credited("已入账","6"),
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