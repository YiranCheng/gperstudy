package com.gupao.singletondemo;

import java.io.*;

/**
 * @author yiran
 */
public class SerializableTest {

    public static void main(String[] args) {
        InnerClassLazySingleton innerClassLazySingleton = InnerClassLazySingleton.create();
        InnerClassLazySingleton innerClassLazySingleton1 = null;

        EnumSingleton enumSingleton = EnumSingleton.create();
        EnumSingleton enumSingleton1 = null;

        try {
            FileOutputStream fos = new FileOutputStream("output.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(innerClassLazySingleton);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("output.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            innerClassLazySingleton1 = (InnerClassLazySingleton) ois.readObject();
            System.out.println(innerClassLazySingleton);
            System.out.println(innerClassLazySingleton1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
