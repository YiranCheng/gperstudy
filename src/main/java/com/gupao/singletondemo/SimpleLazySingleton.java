package com.gupao.singletondemo;

/**
 * @author yiran
 */
public class SimpleLazySingleton {
    private static SimpleLazySingleton lazySingleton;
    private SimpleLazySingleton(){
        if (lazySingleton != null) {
            throw new RuntimeException("禁止通过反射创建实例");
        }
    }

    public static SimpleLazySingleton create() {
        if (lazySingleton == null) {
            lazySingleton = new SimpleLazySingleton();
        }
        return lazySingleton;
    }
}
