package com.haieros.design_23.structure.composite.basic;

/**
 * Created by Kang on 2017/12/12.
 */

public abstract class Component {

    abstract void add(Component component);
    abstract void remove(Component component);
    abstract Component getChild(int position);
    abstract void operation();
}
