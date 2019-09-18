package com.gupao.singletondemo;

/**
 * @author yiran
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.create();
        EnumSingleton singleton1 = EnumSingleton.HELLO;
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
