package com.haieros.design_23.structure.decorator.impl;

/**
 * Created by Kang on 2017/11/29.
 */

public class Decorator implements Sourceable {

    protected Source source;

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public void method() {
        source.method();
    }
}
