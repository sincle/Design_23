package com.haieros.design_23.behavior.strategy;

/**
 * Created by Kang on 2018/4/11.
 */

public class Client {
    public static void main(String[] agrs){

        PrimaryMemberStrategy primaryMemberStrategy = new PrimaryMemberStrategy();
        Price price = new Price(primaryMemberStrategy);
        double result = price.price(200);
        System.out.println("result:"+result);
    }
}
