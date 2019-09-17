package com.gupao.factorydemo.simplefactory;

public class MathCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("study math");
    }
}
