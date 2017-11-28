package com.haieros.design_23.factory.multiFactory;

/**
 * Created by Kang on 2017/11/28.
 */

public class SendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

}
