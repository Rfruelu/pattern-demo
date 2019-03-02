package com.lujia.pattern.factory.abstractFactory;

import com.lujia.pattern.factory.domain.Car;

/**
 * 美国建的工厂
 * @author :lujia
 * @date :2018/9/9  17:44
 */
public class AmericaFactory extends AbstractFactory {
    @Override
    Car getCar(String name) {
        return new Car(name);
    }

    @Override
    Mobile getMobile() {
        return new Iphone("苹果");
    }
}
