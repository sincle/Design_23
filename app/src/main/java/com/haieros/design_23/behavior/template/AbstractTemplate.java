package com.haieros.design_23.behavior.template;

/**
 * Created by Kang on 2018/4/12.
 */

public abstract class AbstractTemplate {
    /**
     * 模板方法
     */
    public void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    /**
     * 基本方法（已经实现）
     */
    private void concreteMethod() {
        // TODO: 2018/4/12  
    }
    /**
     * 基本方法(空方法)
     */
    protected void hookMethod() {

    }
    /**
     * 基本方法的声明（由子类实现）
     */
    protected abstract void abstractMethod();
}
