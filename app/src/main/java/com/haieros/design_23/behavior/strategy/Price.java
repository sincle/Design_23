package com.haieros.design_23.behavior.strategy;

/**
 * Created by Kang on 2018/4/11.
 */

public class Price {

    MemberStrategy strategy = null;
    public Price(MemberStrategy strategy){
        this.strategy = strategy;
    }
    public double price(double price){
        return strategy.calcPrice(price);
    }
}
