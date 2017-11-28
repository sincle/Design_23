package com.haieros.design_23.builder.commonBuider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kang on 2017/11/28.
 */

public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
