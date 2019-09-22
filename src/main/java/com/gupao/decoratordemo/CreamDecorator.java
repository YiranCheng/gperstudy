package com.gupao.decoratordemo;

/**
 * @author yiran
 */
public class CreamDecorator extends DrinkDecorator {
    CreamDecorator(IDrink iDrink) {
        super(iDrink);
    }

    @Override
    public String getName() {
        return super.getName() + "加奶油";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
