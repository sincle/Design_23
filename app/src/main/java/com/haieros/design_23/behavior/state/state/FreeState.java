package com.haieros.design_23.behavior.state.state;

/**
 * Created by Kang on 2018/4/12.
 */

class FreeState implements State{

    Room roomManager;

    public FreeState(Room room) {
        this.roomManager = room;
    }

    @Override
    public void bookRoom() {
        System.out.println("预定成功...");
        roomManager.setState(roomManager.getBookedState());
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("还未预定..不能取消预定.");
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功...");
        roomManager.setState(roomManager.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        System.out.println("还没有被预定,没有被入住,不能退仿");
        roomManager.setState(roomManager.getFreeState());
    }
}
