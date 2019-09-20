package com.gupao.strategydemo;

/**
 * @author yiran
 */
public abstract class Pay {
    public abstract String getName();

    public abstract double queryBalance(String uid);

    public Result pay(String uid, double money){
        if (queryBalance(uid) >= money) {
            return new Result(200,"支付成功","支付金额" + money);
        }else {
            return new Result(500,"支付失败", "账户余额" + queryBalance(uid));
        }
    }
}
