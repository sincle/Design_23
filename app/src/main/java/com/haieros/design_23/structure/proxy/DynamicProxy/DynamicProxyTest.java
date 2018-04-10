package com.haieros.design_23.structure.proxy.DynamicProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Kang on 2017/11/29.
 */

public class DynamicProxyTest {

    public static void main(String[] agrs) {

        RealSubject subject = new RealSubject();
        DynamicProxy proxy = new DynamicProxy(subject);

//        ClassLoader classLoader = subject.getClass().getClassLoader();
//        Subject instance = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
//        instance.visit();

//        Class<?> proxyClass = Proxy.getProxyClass(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces());
//
//        try {
//            Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
//            Object o = constructor.newInstance(proxy);
//            System.out.println("o:"+o.hashCode());
//            if (o instanceof RealSubject) {
//                return;
//            }
//            Subject o1 = (Subject) o;
//            System.out.println("o1:"+o.hashCode());
//            Learn o2 = (Learn) o;
//            System.out.println("o2:"+o.hashCode());
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }


//        Class<?>[] interfaces = proxyClass.getInterfaces();
//        Constructor<?>[] constructors = proxyClass.getConstructors();
//
//        for (Constructor<?> constructor : constructors) {
//            String name = constructor.getName();
//            StringBuilder sb = new StringBuilder(name);
//            sb.append('(');
//            Class<?>[] clazzParams = constructor.getParameterTypes();
//            for (Class<?> clazzParam : clazzParams) {
//                sb.append(clazzParam.getClass().getName()).append(",");
//            }
//            if (clazzParams != null && clazzParams.length > 0)
//                sb.deleteCharAt(sb.length() - 1);
//            sb.append(')');
//            System.out.println(sb.toString());
//        }
//
//
//        System.out.println("------begin method list-------");
//        Method[] clazzMethods = proxyClass.getMethods();
//        for (Method method : clazzMethods) {
//            String name = method.getName();
//            StringBuilder sb = new StringBuilder(name);
//            Class<?>[] clazzParams = method.getParameterTypes();
//            sb.append('(');
//            for (Class<?> clazzParam : clazzParams) {
//                sb.append(clazzParam.getClass().getName()).append(",");
//            }
//            if (clazzParams != null && clazzParams.length > 0)
//                sb.deleteCharAt(sb.length() - 1);
//            sb.append(')');
//            System.out.println(sb.toString());
//        }


        Subject test = test(RealSubject.class);
        System.out.println("test:" + test.hashCode());
        //System.out.println("test:"+test.toString());
        //test.visit();
        Learn test1 = (Learn) test;
        System.out.println("test1:" + test1.hashCode());
        //System.out.println("test1:"+test1.toString());
        // test1.learn();
//        RealSubject r = getR(RealSubject.class);
//        System.out.println("R:" + r.hashCode());
//        Subject s = r;
//        System.out.println("s:"+s.hashCode());
//        Learn l = r;
//        System.out.println("l:"+l.hashCode());
    }

    public static <T> T test(final Class<T> clazz) {
        Object o = null;
        try {
            o = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        final Object finalO = o;
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(finalO, args);
            }
        };

        T t = (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), invocationHandler);
        //System.out.println("t:"+t.toString());
        return t;
    }

    public static <T> T getR(Class<T> clazz) {
        T t = null;
        try {
            t = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }
}
