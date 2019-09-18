package com.gupao.singletondemo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yiran
 */
public class ContainerSingleton {
    private ContainerSingleton(){}

    private static Map<String,Object> container = new ConcurrentHashMap<>();

    public static Object create(String classname) {
        synchronized (container) {
            if (!container.containsKey(classname)){
                Object o = null;
                try {
                    Class clazz = Class.forName(classname);
                    o = clazz.newInstance();
                    container.put(classname,o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return o;
            }else {
                return container.get(classname);
            }
        }
    }
}
