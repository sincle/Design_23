package com.haieros.design_23.behavior.chainofresponsibility;

/**
 * Created by Kang on 2018/4/9.
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 */
public abstract class Handler {

    protected Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void handleRequest(int request);
}
