package com.gupao.proxydemo.dynamicproxy.jdkproxy;

/**
 * @author yiran
 */
public class SomeBody implements Person,Needs {
    @Override
    public void findLove() {
        System.out.println("找呀找呀找朋友，找到一个好朋友");
    }

    @Override
    public void findHouse() {
        System.out.println("无家可归的可怜人，哪里才是我的家");

    }

    @Override
    public void findJob() {
        System.out.println("无业游民，想要一份稳定的工作");
    }

    @Override
    public int getTaller(int inch) {
        System.out.println("再长高" + inch + "cm,就好了");
        return 160+inch;
    }
}
