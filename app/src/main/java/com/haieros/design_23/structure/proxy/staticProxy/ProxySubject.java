package com.haieros.design_23.structure.proxy.staticProxy;

/**
 * Created by Kang on 2017/11/29.
 */

public class ProxySubject implements Subject {

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        before();
        realSubject.visit();
        after();
    }

    private void after() {
        System.out.println("after");
    }

    private void before() {
        System.out.println("before");
    }
}
