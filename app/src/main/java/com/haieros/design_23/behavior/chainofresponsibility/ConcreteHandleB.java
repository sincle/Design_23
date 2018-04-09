package com.haieros.design_23.behavior.chainofresponsibility;

/**
 * Created by Kang on 2018/4/9.
 */

public class ConcreteHandleB extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println("B process request");
        }else if(nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
