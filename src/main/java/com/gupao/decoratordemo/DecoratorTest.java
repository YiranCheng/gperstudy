package com.gupao.decoratordemo;

/**
 * @author yiran
 */
public class DecoratorTest {
    public static void main(String[] args) {
        IDrink drink = new Coffee();
        drink = new SugarDecorator(drink);
        drink = new CreamDecorator(drink);
        drink = new CreamDecorator(drink);
        System.out.println(drink.getName());
        System.out.println(drink.getPrice());
    }
}
