package com.gupao.observerdemo.gper;

/**
 * @author yiran
 */
public class ObserverTest {
    public static void main(String[] args) {
        Question question = new Question();
        question.setName("cyr");
        question.setContent("装饰器模式和代理模式的根本区别是什么？");

        GPer gPer = GPer.getInstance();
        gPer.addObserver(new Teacher("Tom"));
        gPer.addObserver(new Teacher("Mic"));
        gPer.addObserver(new Teacher("Yang"));
        gPer.publishQuestion(question);

    }
}
