package com.haieros.design_23.build.factory.staticFactory;

import com.haieros.design_23.build.factory.multiFactory.MailSender;
import com.haieros.design_23.build.factory.multiFactory.Sender;
import com.haieros.design_23.build.factory.multiFactory.SmsSender;

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
