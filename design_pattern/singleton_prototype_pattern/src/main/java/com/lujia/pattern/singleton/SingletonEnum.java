package com.lujia.pattern.singleton;

/**
 * 枚举实现单列
 * @author :lujia
 * @date :2018/9/27  15:19
 */
public enum  SingletonEnum {

    RED("红色"),BLACK("黑色"),GREEN("绿色");

    private String name;

    public String getName() {
        return name;
    }

    SingletonEnum(String name) {
        this.name = name;
    }
}
