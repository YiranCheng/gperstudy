package com.gupao.strategydemo;

/**
 * @author yiran
 */
public class Order {
    private String uid;
    private Double money;

    Order(String uid, double money) {
        this.uid = uid;
        this.money = money;
    }

    public Result pay(String payway){
        Pay pay = PaymentStrategy.getPayment(payway);
        return pay.pay(uid,money);
    }
}
