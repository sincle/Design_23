package com.haieros.design_23.structure.composite.basic;

/**
 * Created by Kang on 2017/12/12.
 */

public class Leaf extends Component {
    @Override
    void add(Component component) {
//异常处理或错误提示
    }

    @Override
    void remove(Component component) {
//异常处理或错误提示
    }

    @Override
    Component getChild(int position) {
        //异常处理或错误提示
        return null;
    }

    @Override
    void operation() {
        //叶子构建具体业务方法实现
        System.out.println("operation");
    }
}
