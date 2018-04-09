package com.haieros.design_23.behavior.transaction;

/**
 * Created by Kang on 2018/4/9.
 */

public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }
    public void action(){
        command.excecute();
    }
}
