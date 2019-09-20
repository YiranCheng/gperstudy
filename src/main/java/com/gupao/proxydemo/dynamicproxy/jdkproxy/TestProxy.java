package com.gupao.proxydemo.dynamicproxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author yiran
 */
public class TestProxy {
    public static void main(String[] args) throws IOException {
        GodProxy godProxy = new GodProxy();
        Person person = (Person) godProxy.createProxy(new SomeBody());
        person.findHouse();
        person.findLove();
        person.findJob();
        Needs needs = (Needs) godProxy.createProxy(new SomeBody());
        int tall = needs.getTaller(5);
        System.out.println(tall);

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class,Needs.class});
        FileOutputStream fos = new FileOutputStream("E://$Proxy0.class");
        fos.write(bytes);
        fos.flush();
        fos.close();
    }
}
