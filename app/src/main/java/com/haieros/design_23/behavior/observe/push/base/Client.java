package com.haieros.design_23.behavior.observe.push.base;

/**
 * Created by Kang on 2018/4/13.
 */

public class Client {

    public static void main(String[] agrs){

        ConcreteSubjectA subjectA = new ConcreteSubjectA();

        ConcreteObserver observer = new ConcreteObserver();

        subjectA.attach(observer);
        subjectA.attach(new Observer() {
            @Override
            public void update(String state) {
                System.out.println("state:"+state);
            }
        });
        subjectA.attach(new Observer() {
            @Override
            public void update(String state) {
                System.out.println("state1:"+state);
            }
        });

        subjectA.change("123434");
    }
}
