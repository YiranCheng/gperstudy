package com.gupao.factorydemo.factorymethod;

public class ShirtFactory implements ClothesFactory {
    @Override
    public Clothes create() {
        return new Shirt();
    }
}
