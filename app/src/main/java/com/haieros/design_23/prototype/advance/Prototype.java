package com.haieros.design_23.prototype.advance;

/**
 * Created by Kang on 2017/11/29.
 */

public interface Prototype {

    Prototype clone();
    String getName();
    void setName(String name);
}
