package com.haieros.design_23.structure.bridge.impl;

/**
 * Created by Kang on 2017/11/30.
 */

public class MyBridge extends Bridge implements Sourceable{

    public void method(){
        getSource().method();
    }
}
