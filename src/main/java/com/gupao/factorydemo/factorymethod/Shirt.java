package com.gupao.factorydemo.factorymethod;

public class Shirt implements Clothes {
    @Override
    public void wear() {
        System.out.println("穿T恤");
    }
}
