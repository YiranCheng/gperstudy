package com.gupao.decoratordemo;

/**
 * @author yiran
 */
public class DrinkDecorator implements IDrink {
    private IDrink iDrink;

    DrinkDecorator(IDrink iDrink) {
        this.iDrink = iDrink;
    }

    @Override
    public String getName() {
        return iDrink.getName();
    }

    @Override
    public int getPrice() {
        return iDrink.getPrice();
    }
}
