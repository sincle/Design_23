package com.haieros.design_23.behavior.observe.push.base;

/**
 * Created by Kang on 2018/4/13.
 */

public class ConcreteSubjectA extends Subject {

    private String state;

    public String getState(){

        return state;
    }
    public void change(String state){
        this.state = state;
        System.out.println("ConcreteSubjectA: " + state);
        this.notifyAllObservers(state);
    }
}
