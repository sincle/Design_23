package com.haieros.design_23.structure.bridge.base;

/**
 * Created by Kang on 2017/11/30.
 */

public abstract class Abstraction {

    protected Implementor impl; //实现部分 接口

    public void setImpl(Implementor impl){

        this.impl = impl;
    }
    public abstract void operation();
}
