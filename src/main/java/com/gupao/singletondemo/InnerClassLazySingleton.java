package com.gupao.singletondemo;

import java.io.Serializable;

/**
 * @author yiran
 */
public class InnerClassLazySingleton implements Serializable {
    private InnerClassLazySingleton(){
        if (InnerClass.SINGLETON!=null) {
            throw new RuntimeException("禁止通过反射的方式创建实例");
        }
    }
    public static InnerClassLazySingleton create(){
        return InnerClass.SINGLETON;
    }

    private static class InnerClass{
        static final InnerClassLazySingleton SINGLETON = new InnerClassLazySingleton();
    }

    private Object readResolve(){
        return InnerClass.SINGLETON;
    }
}
