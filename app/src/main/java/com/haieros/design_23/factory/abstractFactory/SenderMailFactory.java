package com.haieros.design_23.factory.abstractFactory;

/**
 * Created by Kang on 2017/11/28.
 */

public class SenderMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
