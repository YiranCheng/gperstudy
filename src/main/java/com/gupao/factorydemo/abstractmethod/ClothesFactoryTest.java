package com.gupao.factorydemo.abstractmethod;

import com.gupao.factorydemo.factorymethod.Dress;

public class ClothesFactoryTest {
    public static void main(String[] args) {
        ClothesFactory clothesFactory = new AdidasClothesFactory();
        Dress dress = clothesFactory.createDress();
        dress.wear();
    }
}
