package com.haieros.design_23.behavior.observe.push.base;

/**
 * Created by Kang on 2018/4/13.
 */

public class ConcreteObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.println("ConcreteObserver:"+state);
    }
}
