package com.haieros.design_23.build.prototype.advance;

/**
 * Created by Kang on 2017/11/29.
 */

public class Client {

    public static void main(String[] agrs){


        try {
            // create prototype and register
            Prototype prototype1 = new ConcretePrototype1();
            PrototypeManager.setPrototype("p1", prototype1);

            //get prototype and create object
            Prototype p2 = PrototypeManager.getPrototype("p1").clone();
            p2.setName("wang");
            System.out.println("p2:"+p2);

            //有人动态的切换了实现
            Prototype p3 = new ConcretePrototype2();
            PrototypeManager.setPrototype("p1", p3);

            //重新获取原型来创建对象
            Prototype p4 = PrototypeManager.getPrototype("p1").clone();
            p4.setName("李四");
            System.out.println("第二个实例：" + p4);

            //有人注销了这个原型
            PrototypeManager.removePrototype("p1");

            //再次获取原型来创建对象
            Prototype p5 = PrototypeManager.getPrototype("p1").clone();
            p5.setName("王五");
            System.out.println("第三个实例：" + p5);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
