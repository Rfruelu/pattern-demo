package com.lujia.pattern.factory.simple;

import com.lujia.pattern.factory.domain.Car;
import org.junit.Test;

/**
 * 简单工厂
 * @author :lujia
 * @date :2018/9/9  17:02
 */
public class SimpleFactory {


    public Car getCar(String name){

        switch (name){
            case "BYD":
                return new Car("比亚迪");
            case "BWM":
                return new Car("宝马");
            case "V":
                return new Car("大众");
            default:
                System.out.println("不能生产您所需的产品");
                return null;
        }
    }

    @Test
    public void test(){
        SimpleFactory simpleFactory=new SimpleFactory();

        Car bydCar = simpleFactory.getCar("BYD");
        System.out.println(bydCar.getName());


    }
}
