package com.lujia.pattern.proxy.staticProxy;

/**
 * @author :lujia
 * @date :2018/10/8  10:35
 */
public class Son implements Person {
    @Override
    public void eat() {

    }

    @Override
    public void findLover() {

        System.out.println("new object");
    }
}
