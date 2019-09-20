package com.gupao.strategydemo;

/**
 * @author yiran
 */
public class AliPay extends Pay {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 30000;
    }
}
