package com.gupao.observerdemo.guava;

import com.google.common.eventbus.Subscribe;
import com.gupao.observerdemo.gper.Question;

/**
 * @author yiran
 */
public class Teacher {

    private  String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void subscribe(Question question) {
        System.out.println("=================");
        System.out.println(name+"老师，您好");
        System.out.println("有一个问题请您回答：");
        System.out.println(question.getContent() + " 提问者：" + question.getName());
    }
}
