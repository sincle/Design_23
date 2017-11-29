package com.haieros.design_23.structure.decorator.impl;

/**
 * Created by Kang on 2017/11/29.
 */

public class DecoratorB extends Decorator {

    public void method(){
        super.method();
        afterMethod();
    }

    private void afterMethod() {
        System.out.println("after method");
    }
}
