package com.haieros.design_23.structure.bridge.base;

/**
 * Created by Kang on 2017/11/30.
 */

public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        impl.operationImpl();
    }
}
