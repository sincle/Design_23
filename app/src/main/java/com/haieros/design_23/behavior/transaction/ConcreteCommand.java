package com.haieros.design_23.behavior.transaction;

/**
 * Created by Kang on 2018/4/9.
 */

public class ConcreteCommand implements Command {

    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {

        this.receiver = receiver;
    }

    @Override
    public void excecute() {

        receiver.action();
    }

}
