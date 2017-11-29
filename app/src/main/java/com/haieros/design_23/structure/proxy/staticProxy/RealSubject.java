package com.haieros.design_23.structure.proxy.staticProxy;

/**
 * Created by Kang on 2017/11/29.
 */

public class RealSubject implements Subject {

    @Override
    public void visit() {
        System.out.println("real visit");
    }
}
