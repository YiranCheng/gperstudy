package com.gupao.observerdemo.guava;

import com.google.common.eventbus.EventBus;
import com.gupao.observerdemo.gper.Question;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiran
 */
public class GPer {

    private String name = "咕泡社区";

    private static GPer gPer = null;

    private List<Object> listener = new ArrayList<>();

    private GPer() {}

    public static GPer getInstance(){
        if (gPer == null) {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void addListener(Object o){
        listener.add(o);
    }

    public void publish(Question question){
        System.out.println(question.getContent() + " by " + question.getName());
        if (listener.size() != 0) {
            EventBus eventBus = new EventBus();
            for (Object o:listener) {
                eventBus.register(o);
            }
            eventBus.post(question);
        }
    }
}
