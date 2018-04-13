package com.haieros.design_23.behavior.observe.pull;


/**
 * Created by Kang on 2018/4/13.
 */

public class ConcreteObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("subect:"+ ((ConcreteSubjectA)subject).getState());
    }
}
