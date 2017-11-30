package com.haieros.design_23.structure.facade.impl;

/**
 * Created by Kang on 2017/11/30.
 */

public class FacadeTest {

    public static void main(String[] agrs){

        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
