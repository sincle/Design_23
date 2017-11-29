package com.haieros.design_23.structure.proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Kang on 2017/11/29.
 */

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object,args);
        return result;
    }
}
