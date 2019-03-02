package com.lujia.pattern.factory.abstractFactory;

import com.lujia.pattern.factory.domain.Car;

/**
 * 抽象工厂
 * @author :lujia
 * @date :2018/9/9  17:39
 */
public abstract class AbstractFactory {

     abstract Car getCar(String name);

     abstract Mobile getMobile();


}
