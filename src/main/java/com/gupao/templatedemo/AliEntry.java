package com.gupao.templatedemo;

/**
 * @author yiran
 */
public class AliEntry extends AbstractEntryTemplate {

    private boolean testFlag;

    AliEntry(boolean testFlag) {
        this.testFlag = testFlag;
    }

    @Override
    public boolean isTest(){
        return testFlag;
    }

    @Override
    public void test() {
        System.out.println("体检，并拿到体检报告");
    }
}
