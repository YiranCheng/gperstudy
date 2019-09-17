package com.gupao.factorydemo.abstractmethod;

import com.gupao.factorydemo.factorymethod.Dress;
import com.gupao.factorydemo.factorymethod.Shirt;

public class AdidasClothesFactory implements ClothesFactory {
    @Override
    public Dress createDress() {
        return new AdidasDress();
    }

    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }
}
