package moka.user.enums;

import org.jetbrains.annotations.Contract;

public enum UserEnum {
    defaultValue("默认","0"),
    updateOnly("修改","1"),
    readOnly("只读","2"),
    watchOnly("不可查看","3"),
    adminName("管理员名称","超级管理员"),
    ;
    private String name;
    private String value;

    UserEnum(String name, String value) {
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