package moka.invoicePlan.enums;

public enum InvoicePlanEnum {
    initial("初始状态","1"),
    ;
    private String name;
    private String value;

    InvoicePlanEnum(String name, String value) {
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