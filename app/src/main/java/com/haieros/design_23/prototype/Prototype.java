package com.haieros.design_23.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Kang on 2017/11/29.
 * 原型模式虽然是创建型的模式，但是与工程模式没有关系，从名字即可看出，
 * 该模式的思想就是将一个对象作为原型，对其进行复制、克隆，产生一个和
 * 原对象类似的新对象。在Java中，复制对象是通过clone()实现的，
 */

public class Prototype implements Cloneable, Serializable {

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Prototype clone = (Prototype) super.clone();
        return clone;
    }


    /* 深复制 */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Object o = ois.readObject();

        return o;
    }
}
