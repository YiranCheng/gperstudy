package com.gupao.adapterdemo.simple;

/**
 * @author yiran
 */
public class MethodAdapter implements NewMethod {
    private OldSystem oldSystem;

    MethodAdapter(OldSystem oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public int newElectricity() {
        int input = oldSystem.createElectricity();
        System.out.println("输入电流 " + input);
        int output = input/44;
        System.out.println("输出电流 "+ output);
        return output;
    }
}
