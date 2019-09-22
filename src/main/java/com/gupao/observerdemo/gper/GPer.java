package com.gupao.observerdemo.gper;

import java.util.Observable;

/**
 * @author yiran
 */
public class GPer extends Observable {
    private String name = "咕泡社区";

    private static GPer gPer = null;

    private GPer(){

    }

    public static GPer getInstance(){
        if (gPer == null) {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName(){
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getContent() + " by " + question.getName());
        setChanged();
        notifyObservers(question);
    }
}
