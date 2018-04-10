package com.haieros.design_23.structure.bridge.impl;


/**
 * Created by Kang on 2017/11/30.
 */

public class Client {

    public static void main(String[] agrs){

        Bridge myBridge = new MyBridge();
        myBridge.setSource(new Sourcesub1());
        myBridge.method();
        myBridge.setSource(new Sourcesub2());
        myBridge.method();
    }
}
