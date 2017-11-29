package com.haieros.design_23.prototype.primary;

/**
 * Created by Kang on 2017/11/29.
 */

public class Client {

    private IPrototype prototype;

    public Client(IPrototype prototype) {
        this.prototype = prototype;
    }

    public void operation(){
        IPrototype clone = (IPrototype) prototype.clone();
    }
}
