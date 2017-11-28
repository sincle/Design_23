package com.haieros.design_23.factory.staticFactory;

/**
 * Created by Kang on 2017/11/28.
 */

public class TestFactory {

    public static void main(String[] agrs){

        SendFactory.produceMail().send();
        SendFactory.produceSms().send();
    }
}
