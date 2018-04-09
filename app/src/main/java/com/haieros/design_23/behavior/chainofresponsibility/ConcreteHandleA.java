package com.haieros.design_23.behavior.chainofresponsibility;

/**
 * Created by Kang on 2018/4/9.
 */

public class ConcreteHandleA extends Handler{
    @Override
    public void handleRequest(int request) {
        if(request > 0 && request < 10) {
            System.out.println("A process request");
        }else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
