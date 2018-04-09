package com.haieros.design_23.structure.Flyweight.singlefly;

/**
 * Created by Kang on 2018/3/22.
 */

public class Test_ {

    public static void main(String[] agrs){

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight = factory.factory(new Character('a'));
        flyweight.operation("first call");

        Flyweight a = factory.factory('a');
        a.operation("second call");

        Flyweight a1 = factory.factory(new Character('a'));
        a1.operation("thrid call");
    }
}
