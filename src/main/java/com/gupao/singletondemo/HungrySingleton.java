package com.gupao.singletondemo;

public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton create(){
        return hungrySingleton;
    }
}
