package com.haieros.design_23.structure.decorator.impl;

/**
 * Created by Kang on 2017/11/29.
 */

public class DecoratorA extends Decorator {

    public void method(){
        super.method();

        beforeMethod();
    }

    private void beforeMethod() {
        System.out.println("A method");
    }
}
