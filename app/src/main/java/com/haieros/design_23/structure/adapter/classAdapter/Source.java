package com.haieros.design_23.structure.adapter.classAdapter;

/**
 * Created by Kang on 2017/11/29.
 * 有一个Source类，拥有一个方法，待适配，目标接口is Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里，
 *
 */
/**
 * 源类，我们需要这个类实现接口  Targetable，但这个类不能被改变
 * 源类与接口之间是没有关系的
 */
public class Source {

    public void method1(){
        System.out.println("this is source method1");
    }
}
