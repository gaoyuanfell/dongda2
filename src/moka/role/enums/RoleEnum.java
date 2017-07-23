package moka.role.enums;

import org.jetbrains.annotations.Contract;

public enum RoleEnum {
    updateOnly("修改","1"),
    readOnly("只读","2"),
    ;
    private String name;
    private String value;

    RoleEnum(String name, String value) {
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