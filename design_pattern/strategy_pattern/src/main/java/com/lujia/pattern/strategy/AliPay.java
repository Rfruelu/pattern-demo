package com.lujia.pattern.strategy;

/**
 * @author :lujia
 * @date :2018/10/8  17:00
 */
public class AliPay implements Payment {
    @Override
    public PayStatus pay() {
        System.out.println("支付宝支付");
        return new PayStatus();
    }
}
