package com.haieros.design_23.build.factory.multiFactory;

/**
 * Created by Kang on 2017/11/28.
 */

public class TestFactory {

    public static void main(String[] agrs){

        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();

        Sender sms = factory.produceSms();
        sms.send();
    }
}
