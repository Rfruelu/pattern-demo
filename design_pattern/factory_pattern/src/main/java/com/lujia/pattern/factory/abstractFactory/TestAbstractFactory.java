package com.lujia.pattern.factory.abstractFactory;

import org.junit.Test;

/**
 * @author :lujia
 * @date :2018/9/9  17:46
 */
public class TestAbstractFactory {

    @Test
    public void test(){

        //中国建的工厂，只能生产是三种类型的车
        AbstractFactory factory=new ChinaFactory();

        System.out.println(factory.getCar("BWM").getName());
        System.out.println(factory.getCar("福特"));
        //老美建的工厂，老美技术发达，给要什么车有什么车
        factory=new AmericaFactory();

        System.out.println(factory.getCar("美国产宝马").getName());
        System.out.println(factory.getCar("美国福特").getName());


    }

    @Test
    public void testMobile(){
        AbstractFactory  factory=new ChinaFactory();
        Mobile mobile = factory.getMobile();
        System.out.println(mobile.getName());
        factory=new AmericaFactory();
        mobile=factory.getMobile();
        System.out.println(mobile.getName());


    }
}
