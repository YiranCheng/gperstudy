package com.gupao.observerdemo.guava;

import com.google.common.eventbus.EventBus;
import com.gupao.observerdemo.gper.Question;

/**
 * @author yiran
 */
public class GuavaTest {
    public static void main(String[] args) {
        Question question = new Question();
        question.setName("cyr");
        question.setContent("装饰器模式和代理模式的根本区别是什么？");

        GPer gPer = GPer.getInstance();
        gPer.addListener(new Teacher("Tom"));
        gPer.addListener(new Teacher("nick"));
        gPer.publish(question);
    }
}
