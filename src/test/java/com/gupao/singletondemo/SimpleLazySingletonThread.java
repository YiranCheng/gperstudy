package com.gupao.singletondemo;

/**
 * @author yiran
 */
public class SimpleLazySingletonThread implements Runnable {
    @Override
    public void run() {
//        SimpleLazySingleton simpleLazySingleton = SimpleLazySingleton.create();
//        System.out.println(Thread.currentThread().getName() + ":"+simpleLazySingleton);
        DoubleCheckLazySingleton doubleCheckLazySingleton = DoubleCheckLazySingleton.create();
        System.out.println(Thread.currentThread().getName() + ":" + doubleCheckLazySingleton);

        InnerClassLazySingleton innerClassLazySingleton = InnerClassLazySingleton.create();
        System.out.println(Thread.currentThread().getName() + ":" + innerClassLazySingleton);
    }

    public static void main(String[] args) {
        SimpleLazySingletonThread r = new SimpleLazySingletonThread();
        new Thread(r).start();
        new Thread(r).start();
        System.out.println("end thread");
    }
}
