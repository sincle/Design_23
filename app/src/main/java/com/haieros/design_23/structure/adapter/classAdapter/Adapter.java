package com.haieros.design_23.structure.adapter.classAdapter;

/**
 * Created by Kang on 2017/11/29.
 * Targetable接口的实现类就具有了Source类的功能。
 */
/* 这是适配器，它接受了 Source 中已有的接口并产生我们需要的接口
 * method1()方法继承自 Source 类（即已有的接口），不用再作声明
 * 这里适配器的作用相当于为源类与接口之间建立了一种关系，类似于 implements
 *  */
public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }
}
