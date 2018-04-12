package com.haieros.design_23.behavior.state.state;

/**
 * Created by Kang on 2018/4/12.
 */

public interface State {
    /**
     * 预定
     */
    void bookRoom();

    /**
     * 取消预定
     */
    void unsubscribeRoom();

    /**
     * 入住
     */
    void checkInRoom();

    /**
     * 退房
     */
    void checkOutRoom();
}
