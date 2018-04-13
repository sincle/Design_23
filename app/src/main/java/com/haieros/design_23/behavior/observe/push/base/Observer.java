package com.haieros.design_23.behavior.observe.push.base;

/**
 * Created by Kang on 2018/4/13.
 */

public interface Observer {
    int i = 0;
    /**
     * 更新
     * @param state 状态
     */
    void update(String state);
}
