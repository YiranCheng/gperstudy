package com.gupao.strategydemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yiran
 */
public class PaymentStrategy {
    public static final String ALI_PAY = "AliPay";
    public static final String WEIXIN_PAY = "WeixinPay";
    public static final String BANK_PAY = "BackPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String,Pay> map = new HashMap<>();

    static {
        map.put(ALI_PAY, new AliPay());
        map.put(WEIXIN_PAY, new WeixinPay());
        map.put(BANK_PAY, new BankPay());
    }

    public static Pay getPayment(String key) {
        if (!map.containsKey(key)){
            return map.get(DEFAULT_PAY);
        }
        return map.get(key);
    }
}
