package com.haieros.design_23.behavior.state.state;

/**
 * Created by Kang on 2018/4/12.
 */

public class BookedState implements State {
    private final Room roomManager;
    public BookedState(Room room){
        this.roomManager = room;
    }
    @Override
    public void bookRoom() {
        System.out.println("该房间已经被预定");
    }

    @Override
    public void unsubscribeRoom() {
        System.out.println("退订成功...");
        roomManager.setState(roomManager.getFreeState());
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功...");
        roomManager.setState(roomManager.getCheckInState());
    }

    @Override
    public void checkOutRoom() {
        System.out.println("此房间仅仅被预定,不能退房");
    }
}
