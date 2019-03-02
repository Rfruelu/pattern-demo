package com.lujia.pattern.factory.abstractFactory;

import com.lujia.pattern.factory.domain.Car;

/**
 * 中国建的工厂
 * @author :lujia
 * @date :2018/9/9  17:40
 */
public class ChinaFactory extends AbstractFactory {
    @Override
    Car getCar(String name) {
        switch (name){
            case "BYD":
                return new Car("中国产比亚迪");
            case "BWM":
                return new Car("中国产宝马");
            case "V":
                return new Car("中国产大众");
            default:
                System.out.println("不能生产您所需的产品");
                return null;
        }
    }

    @Override
    Mobile getMobile() {
        return new HuaWei("华为");
    }


}
