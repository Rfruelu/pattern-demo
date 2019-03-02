package com.lujia.pattern.strategy;

/**
 * @author :lujia
 * @date :2018/10/8  16:54
 */
public class Order {

    private String uId;

    private String orderId;

    private String amount;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public PayStatus pay(PayType payType){
        return payType.getPayment().pay();
    }
}
