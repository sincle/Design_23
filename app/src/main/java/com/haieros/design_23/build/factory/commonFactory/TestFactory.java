package com.haieros.design_23.build.factory.commonFactory;


/**
 * Created by Kang on 2017/11/28.
 */

public class TestFactory {

    public static void main(String[] agrs){

        SendFactory factory = new SendFactory();

        Sender sms = factory.produce("sms");
        sms.send();

        Sender mail = factory.produce("mail");
        mail.send();
    }
}
