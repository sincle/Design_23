package com.haieros.design_23.behavior.strategy;

/**
 * Created by Kang on 2018/4/11.
 */

public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double bookPeice) {
        System.out.println("无折扣");
        return bookPeice;
    }
}
