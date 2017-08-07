package moka.invoice.enums;

import org.jetbrains.annotations.Contract;

public enum InvoiceEnum {
    preparation("准备中","1"),
    invoiced("已开票","2"),

    mailed("已寄送发票","5"),
    received("已收到发票","6"),

    recorded("已入账","8"),
    payment("已付款","9"),
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