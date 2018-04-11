package com.haieros.design_23.behavior.strategy.duck;

/**
 * Created by Kang on 2018/4/11.
 */

public class GreenheadDuck extends Duck implements IFlyable{
    public GreenheadDuck(){
        flyable = new Flyable();
    }
    @Override
    void display() {
        System.out.println("绿头鸭");
    }

    @Override
    public void fly() {
        flyable.fly();
    }
}
