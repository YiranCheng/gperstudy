package com.gupao.strategydemo;

/**
 * @author yiran
 */
public class WeixinPay extends Pay {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
