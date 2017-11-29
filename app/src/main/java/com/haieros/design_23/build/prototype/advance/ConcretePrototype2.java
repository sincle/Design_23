package com.haieros.design_23.build.prototype.advance;

/**
 * Created by Kang on 2017/11/29.
 */

public class ConcretePrototype2 implements Prototype {

    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        concretePrototype2.setName(this.name);
        return concretePrototype2;
    }

    @Override
    public String toString(){
        return "Now in concretePrototype2 , name = " + this.name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
