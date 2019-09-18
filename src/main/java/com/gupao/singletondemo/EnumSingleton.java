package com.gupao.singletondemo;

import java.io.Serializable;

/**
 * @author yiran
 */
public enum EnumSingleton{
    HELLO;

    public static EnumSingleton create(){
        return HELLO;
    }
}
