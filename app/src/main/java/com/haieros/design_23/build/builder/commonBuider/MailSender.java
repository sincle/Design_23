package com.haieros.design_23.build.builder.commonBuider;

/**
 * Created by Kang on 2017/11/28.
 */

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mailsender");
    }
}
