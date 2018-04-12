package com.haieros.design_23.behavior.state.state;

/**
 * Created by Kang on 2018/4/12.
 */

public class CheckInState implements State {
    private final Room roomManager;
    public CheckInState(Room room){
        this.roomManager = room;
    }
    @Override
    public void bookRoom() {
        System.out.println("该房间已经被入住");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("该房间已经被入住..不能被取消预定.");
    }

    @Override
    public void checkInRoom() {
        System.out.println("该房间已经被入住,不能再次入住");
    }

    @Override
    public void checkOutRoom() {
        System.out.println("退房成功...");
        roomManager.setState(roomManager.getFreeState());
    }
}
