package com.haieros.design_23.behavior.strategy.duck;

/**
 * Created by Kang on 2018/4/11.
 */

public class Client {

    public static void main(String[] agrs){

        GreenheadDuck greenheadDuck = new GreenheadDuck();
        greenheadDuck.display();
        greenheadDuck.fly();
    }
}
