package com.haieros.design_23.behavior.strategy.duck;

/**
 * Created by Kang on 2018/4/11.
 */

public class Flyable implements IFlyable {
    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
