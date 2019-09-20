package com.gupao.proxydemo.dynamicproxy.gpjdkproxy;

import com.gupao.proxydemo.dynamicproxy.jdkproxy.Needs;
import com.gupao.proxydemo.dynamicproxy.jdkproxy.Person;
import com.gupao.proxydemo.dynamicproxy.jdkproxy.SomeBody;

/**
 * @author yiran
 */
public class GPProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new GPGodProxy().createObject(new SomeBody());
        person.findJob();

        Needs needs = (Needs) new GPGodProxy().createObject(new SomeBody());
        int tall = needs.getTaller(5);
    }
}
