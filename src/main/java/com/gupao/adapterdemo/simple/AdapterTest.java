package com.gupao.adapterdemo.simple;

/**
 * @author yiran
 */
public class AdapterTest {
    public static void main(String[] args) {
        NewMethod newMethod = new MethodAdapter(new OldSystem());
        newMethod.newElectricity();
    }
}
