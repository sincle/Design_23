package com.haieros.design_23.behavior.template;

/**
 * Created by Kang on 2018/4/12.
 */

public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void abstractMethod() {
        System.out.println("-----------");
    }

    @Override
    protected void hookMethod() {
        super.hookMethod();
    }
}
