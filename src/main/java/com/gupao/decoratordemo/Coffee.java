package com.gupao.decoratordemo;

/**
 * @author yiran
 */
public class Coffee implements IDrink {
    @Override
    public String getName() {
        return "咖啡";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
