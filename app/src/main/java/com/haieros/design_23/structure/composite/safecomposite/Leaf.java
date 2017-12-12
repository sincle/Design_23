package com.haieros.design_23.structure.composite.safecomposite;

/**
 * Created by Kang on 2017/12/12.
 */

public class Leaf extends Component {

    @Override
    void operation() {
        //叶子构建具体业务方法实现
        System.out.println("operation");
    }
}
