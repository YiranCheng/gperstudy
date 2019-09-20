package com.gupao.proxydemo.dynamicproxy.gpjdkproxy;

import java.lang.reflect.Method;

/**
 * @author yiran
 */
public class GPGodProxy implements GPInvocationHandler{
    private Object object;

    public Object createObject(Object obj) {
        this.object = obj;
        Class clazz = obj.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(object,args);
        after();
        return o;
    }

    private void before() {
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}
