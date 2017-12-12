package com.haieros.design_23.structure.composite.basic;

import java.util.ArrayList;

/**
 * Created by Kang on 2017/12/12.
 */

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    @Override
    void add(Component component) {
        list.add(component);
    }

    @Override
    void remove(Component component) {
        list.remove(component);
    }

    @Override
    Component getChild(int position) {
        return list.get(position);
    }

    @Override
    void operation() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).operation();
        }
    }
}
