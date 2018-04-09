package com.haieros.design_23.behavior.chainofresponsibility;

/**
 * Created by Kang on 2018/4/9.
 */

public class Client {

    public static void main(String[] agrs){

        ConcreteHandleA handleA = new ConcreteHandleA();
        ConcreteHandleB handleB = new ConcreteHandleB();
        ConcreteHandleC handleC = new ConcreteHandleC();

        handleA.setNextHandler(handleB);
        handleB.setNextHandler(handleC);
        handleC.setNextHandler(handleA);

        int[] requests = {2,5,14,22,18,27,20,1,4};
        for (int request : requests) {
            handleA.handleRequest(request);
        }
    }
}
