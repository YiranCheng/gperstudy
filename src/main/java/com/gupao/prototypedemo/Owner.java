package com.gupao.prototypedemo;

import java.io.Serializable;

/**
 * @author yiran
 */
public class Owner implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
