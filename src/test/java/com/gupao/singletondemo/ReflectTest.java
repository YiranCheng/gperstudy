package com.gupao.singletondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author yiran
 */
public class ReflectTest {
    public static void main(String[] args) {
        Class clazz = SimpleLazySingleton.class;
        try {
            Constructor constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object o = constructor.newInstance();
            Object o1 = constructor.newInstance();
            System.out.println(o);
            System.out.println(o1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        InnerClassLazySingleton singleton2 = InnerClassLazySingleton.create();
        System.out.println(singleton2);
    }
}
