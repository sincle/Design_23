package com.haieros.design_23.build.prototype.primary;


/**
 * Created by Kang on 2017/11/29.
 */

public class ConcretePrototype2 implements IPrototype {
    @Override
    public IPrototype clone() {
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        IPrototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
