package com.haieros.design_23.factory.staticFactory;

import com.haieros.design_23.factory.multiFactory.MailSender;
import com.haieros.design_23.factory.multiFactory.Sender;
import com.haieros.design_23.factory.multiFactory.SmsSender;

/**
 * Created by Kang on 2017/11/28.
 */

public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
