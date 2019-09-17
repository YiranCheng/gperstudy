package com.gupao.factorydemo.factorymethod;

public class ClothesFactoryTest {
    public static void main(String[] args) {
        ClothesFactory clothesFactory = new DressFactory();
        Clothes clothes = clothesFactory.create();
        clothes.wear();
    }
}
