package com.haieros.design_23.structure.composite.safecomposite;

import java.util.ArrayList;

/**
 * Created by Kang on 2017/12/12.
 */

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    void add(Component component) {
        list.add(component);
    }

    void remove(Component component) {
        list.remove(component);
    }

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
