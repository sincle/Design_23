package com.haieros.design_23.build.prototype.advance;

/**
 * Created by Kang on 2017/11/29.
 */

public class ConcretePrototype1 implements Prototype {

    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        concretePrototype1.setName(this.name);
        return concretePrototype1;
    }

    @Override
    public String toString(){
        return "Now in ConcretePrototype1 , name = " + this.name;
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
