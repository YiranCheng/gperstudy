package com.gupao.factorydemo.abstractmethod;

import com.gupao.factorydemo.factorymethod.Dress;
import com.gupao.factorydemo.factorymethod.Shirt;

public class NikeClothesFactory implements ClothesFactory {
    @Override
    public Dress createDress() {
        return new NikeDress();
    }

    @Override
    public Shirt createShirt() {
        return new NikeShirt();
    }
}
