package com.haieros.design_23.behavior.observe.pull;

/**
 * Created by Kang on 2018/4/13.
 */

public interface Observer {
    int i = 0;
    /**
     * 更新
     * @param subject 主题
     */
    void update(Subject subject);
}
