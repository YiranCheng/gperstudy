package com.gupao.observerdemo.gper;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yiran
 */
public class Teacher implements Observer {
    private String name;

    Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;

        System.out.println("=================");
        System.out.println(name+"老师，您好");
        System.out.println("有一个来自"+gPer.getName()+"的问题请您回答：");
        System.out.println(question.getContent() + " 提问者：" + question.getName());
    }
}
