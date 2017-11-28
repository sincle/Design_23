package com.haieros.design_23.factory.commonFactory;

/**
 * Created by Kang on 2017/11/28.
 */

public class SendFactory {

    public Sender produce(String type) {

        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型");
            return null;
        }
    }
}
