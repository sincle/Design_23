package com.haieros.design_23.behavior.chainofresponsibility;

/**
 * Created by Kang on 2018/4/9.
 */

public class ConcreteHandleC extends Handler {
    @Override
    public void handleRequest(int request) {
        if(request >= 20 && request < 30) {
            System.out.println("C process request");
        }else if(nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
