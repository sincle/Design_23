package com.haieros.design_23.structure.proxy.staticProxy;

/**
 * Created by Kang on 2017/11/29.
 */

public class ProxyTest {

    public static void main(String[] agrs){

        ProxySubject subject = new ProxySubject(new RealSubject());
        subject.visit();
    }
}
