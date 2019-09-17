package com.gupao.factorydemo.abstractmethod;

import com.gupao.factorydemo.factorymethod.Dress;
import com.gupao.factorydemo.factorymethod.Shirt;

public interface ClothesFactory {
    Dress createDress();

    Shirt createShirt();
}
