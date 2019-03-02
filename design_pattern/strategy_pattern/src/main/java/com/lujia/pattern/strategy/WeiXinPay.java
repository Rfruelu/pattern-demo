package com.lujia.pattern.strategy;

/**
 * @author :lujia
 * @date :2018/10/8  16:58
 */
public class WeiXinPay implements Payment {
    @Override
    public PayStatus pay() {
        System.out.println("微信支付");
        return new PayStatus();
    }
}
