package com.haieros.design_23.build.builder;

/**
 * Created by Kang on 2017/11/28.
 */

public class TextBuilder {

    public static void main(String[] agrs){

        Student kang = new Student.Builder().name("kang").id(1).address("3").build();
        System.out.println("kang:"+kang.toString());
    }
}
