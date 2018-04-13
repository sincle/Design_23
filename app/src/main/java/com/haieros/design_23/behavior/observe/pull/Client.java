package com.haieros.design_23.behavior.observe.pull;

/**
 * Created by Kang on 2018/4/13.
 */

public class Client {

    public static void main(String[] agrs){

        ConcreteObserver observer = new ConcreteObserver();

        ConcreteSubjectA subjectA = new ConcreteSubjectA();

        subjectA.attach(observer);

        subjectA.change("123");
    }
}
