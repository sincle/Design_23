package com.haieros.design_23.build.singleton;

/**
 * Created by Kang on 2017/11/28.
 * 因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，
 * 单独为创建加synchronized关键字，也是可以的：
 */

public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2(){

    }

    private static synchronized void syncInit(){
        if(instance == null) {
            instance = new Singleton2();
        }
    }

    public static Singleton2 getInstance(){
        if(instance == null) {
            syncInit();
        }
        return instance;
    }
}
