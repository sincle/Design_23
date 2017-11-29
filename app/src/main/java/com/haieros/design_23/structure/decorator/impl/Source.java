package com.haieros.design_23.structure.decorator.impl;

/**
 * Created by Kang on 2017/11/29.
 */

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("source method impl");
    }
}
