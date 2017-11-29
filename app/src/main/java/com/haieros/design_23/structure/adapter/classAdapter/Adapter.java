package com.haieros.design_23.structure.adapter.classAdapter;

/**
 * Created by Kang on 2017/11/29.
 * Targetable接口的实现类就具有了Source类的功能。
 */

public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is targetable method2");
    }
}
