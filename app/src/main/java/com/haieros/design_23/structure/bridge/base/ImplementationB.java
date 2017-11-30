package com.haieros.design_23.structure.bridge.base;

/**
 * Created by Kang on 2017/11/30.
 */

public class ImplementationB implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("this is implementationB");
    }
}
