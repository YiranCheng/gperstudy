package com.gupao.decoratordemo;

/**
 * @author yiran
 */
public class SugarDecorator extends DrinkDecorator {
    SugarDecorator(IDrink iDrink) {
        super(iDrink);
    }

    @Override
    public String getName() {
        return super.getName() + "加糖";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
