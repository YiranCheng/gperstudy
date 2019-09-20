package com.gupao.strategydemo;

/**
 * @author yiran
 */
public class BankPay extends Pay{

    @Override
    public String getName() {
        return "工商银行";
    }

    @Override
    public double queryBalance(String uid) {
        return 2000;
    }
}
