package com.haieros.design_23.build.factory.abstractFactory;

/**
 * Created by Kang on 2017/11/28.
 */

public class TestFactory {

    public static void main(String[] agrs){

        new SenderMailFactory().produce().send();

        new SendSmsFactory().produce().send();
    }
}
