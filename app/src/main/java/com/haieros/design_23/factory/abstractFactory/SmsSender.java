package com.haieros.design_23.factory.abstractFactory;


/**
 * Created by Kang on 2017/11/28.
 */

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sms_send");
    }
}
