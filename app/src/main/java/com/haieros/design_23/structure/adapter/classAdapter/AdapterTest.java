package com.haieros.design_23.structure.adapter.classAdapter;

/**
 * Created by Kang on 2017/11/29.
 * 需要一个类A来实现接口B，但是类A并没有实现接口B中的所有方法，而类A是不能被改变的，
 * 这时我们可以创建一个类C，它继承类A并实现接口B，这个类C就是一个适配器。适配器中的
 * 代码将接受你所拥有的接口，并产生你所需要的接口
 */

public class AdapterTest {

    public static void main(String[] agrs){

        Targetable adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }
}
