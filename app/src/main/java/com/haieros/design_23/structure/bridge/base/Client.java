package com.haieros.design_23.structure.bridge.base;

/**
 * Created by Kang on 2017/11/30.
 */

public class Client {

    public static void main(String[] agrs){

        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImpl(new ImplementationA());
        abstraction.operation();

        abstraction.setImpl(new ImplementationB());
        abstraction.operation();
    }
}
