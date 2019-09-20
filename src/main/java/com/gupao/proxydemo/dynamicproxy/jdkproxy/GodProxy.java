package com.gupao.proxydemo.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yiran
 */
public class GodProxy implements InvocationHandler {

    private Object object;

    public Object createProxy(Object o) {
        object = o;
        Class clazz = o.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(object,args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("了解你的需求");
    }

    private void after(){
        System.out.println("返回你所需要要的一切");
    }
}
