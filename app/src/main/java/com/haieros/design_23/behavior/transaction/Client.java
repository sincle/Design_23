package com.haieros.design_23.behavior.transaction;

/**
 * Created by Kang on 2018/4/9.
 */

public class Client {

    public static void main(String[] agrs){

        //创建接受者
        Receiver receiver = new Receiver();
        //创建命令,设置接受者
        ConcreteCommand command = new ConcreteCommand(receiver);
        //创建请求者,设置命令
        Invoker invoker = new Invoker(command);

        invoker.action();
    }
}
