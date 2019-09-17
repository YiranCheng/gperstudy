package com.gupao.factorydemo.factorymethod;

public class DressFactory implements ClothesFactory {
    @Override
    public Clothes create() {
        return new Dress();
    }
}
