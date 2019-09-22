package com.gupao.templatedemo;

/**
 * @author yiran
 */
public abstract class AbstractEntryTemplate {
    final void procedure(){
        offer();

        confirm();

        print();

        if (isTest()) {
            test();
        }
    }

    private void offer(){
        System.out.println("收到offer");
    }

    private void confirm(){
        System.out.println("确认是否入职");
    }

    private void print(){
        System.out.println("打印身份证，毕业证，学位证");
    }

    public boolean isTest(){
        return false;
    }

    public abstract void test();
}
