package com.haieros.design_23.structure.proxy.DynamicProxy;

/**
 * Created by Kang on 2017/11/29.
 */

public class RealSubject implements Subject,Learn{

    @Override
    public void visit() {
        System.out.println("real visit");
    }

    @Override
    public void learn() {
        System.out.println("real leran");
    }
}
