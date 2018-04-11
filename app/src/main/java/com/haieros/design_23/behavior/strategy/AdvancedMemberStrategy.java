package com.haieros.design_23.behavior.strategy;

/**
 * Created by Kang on 2018/4/11.
 */

public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPeice) {
        System.out.println("8 折");
        return bookPeice;
    }
}
