package com.lujia.pattern.proxy.staticProxy;

/**
 * @author :lujia
 * @date :2018/10/8  10:33
 */
public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }


    public void findLover(){
        System.out.println("father 帮助找开始");
        person.findLover();
        System.out.println("father 帮助找结束");

    }
}
