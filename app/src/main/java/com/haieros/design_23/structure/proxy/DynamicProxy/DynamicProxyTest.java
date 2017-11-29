package com.haieros.design_23.structure.proxy.DynamicProxy;


import java.lang.reflect.Proxy;

/**
 * Created by Kang on 2017/11/29.
 */

public class DynamicProxyTest {

    public static void main(String[] agrs){

        RealSubject subject = new RealSubject();
        DynamicProxy proxy = new DynamicProxy(subject);

        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject instance = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
        instance.visit();
    }
}
