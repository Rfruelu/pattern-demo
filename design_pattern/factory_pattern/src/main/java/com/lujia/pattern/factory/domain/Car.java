package com.lujia.pattern.factory.domain;

/**
 * @author :lujia
 * @date :2018/9/9  17:02
 */
public class Car {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Car(String name) {
        this.name = name;
    }
}
