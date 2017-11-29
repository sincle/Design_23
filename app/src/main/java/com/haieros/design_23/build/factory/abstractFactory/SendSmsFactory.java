package com.haieros.design_23.build.factory.abstractFactory;

/**
 * Created by Kang on 2017/11/28.
 */

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {

        return new SmsSender();
    }
}
