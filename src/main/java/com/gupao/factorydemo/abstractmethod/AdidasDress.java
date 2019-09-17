package com.gupao.factorydemo.abstractmethod;

import com.gupao.factorydemo.factorymethod.Dress;

public class AdidasDress extends Dress {
    @Override
    public void wear() {
        System.out.println("穿阿迪达斯的裙子");
    }
}
