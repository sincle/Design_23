package com.haieros.design_23.behavior.strategy.duck;

/**
 * Created by Kang on 2018/4/11.
 */

public abstract class Duck {

    IFlyable flyable;

    public void swim(){
        System.out.println("游泳...");
    }
    public void quack(){
        System.out.println("嘎嘎嘎...");
    }
    abstract void display();
}
