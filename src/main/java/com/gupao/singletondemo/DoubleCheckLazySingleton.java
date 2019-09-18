package com.gupao.singletondemo;

/**
 * @author yiran
 */
public class DoubleCheckLazySingleton {
    private static volatile DoubleCheckLazySingleton singleton;
    private DoubleCheckLazySingleton(){}

    public static DoubleCheckLazySingleton create() {
        if (singleton == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return singleton;
    }
}
