package com.haieros.design_23.structure.bridge.impl;

/**
 * Created by Kang on 2017/11/30.
 */

public abstract class Bridge {

    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource(){
        return source;
    }

    public void setSource(Sourceable source){
        this.source = source;
    }
}
