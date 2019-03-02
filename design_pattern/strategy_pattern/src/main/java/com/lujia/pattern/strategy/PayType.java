package com.lujia.pattern.strategy;

/**
 * @author :lujia
 * @date :2018/10/8  16:56
 */
public enum  PayType {

    WEIXIN(new WeiXinPay()),
    ALI(new AliPay());

    private Payment payment;


    public Payment getPayment() {

        return payment;
    }

    PayType(Payment payment) {
        this.payment = payment;
    }
}
