package com.gupao.strategydemo;

/**
 * @author yiran
 */
public class PayTest {
    public static void main(String[] args) {
        Order order = new Order("123",1000);
        Result result = order.pay(PaymentStrategy.ALI_PAY);
        System.out.println(result);
    }
}
