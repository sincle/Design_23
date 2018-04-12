package com.haieros.design_23.behavior.state.state;

/**
 * Created by Kang on 2018/4/12.
 */

public class Client {
    public static void main(String[] agrs){

        Room room = new Room();
        //预定
        room.bookRoom();
        //再次预定
        room.bookRoom();
        room.checkOutRoom();
        //取消预定
        room.unsubscribeRoom();

        room.bookRoom();
        room.checkInRoom();

        room.bookRoom();
        room.unsubscribeRoom();
        room.checkInRoom();
        room.checkOutRoom();

        room.unsubscribeRoom();
        room.checkOutRoom();
        room.bookRoom();
        room.checkInRoom();
        room.unsubscribeRoom();
        room.bookRoom();
        room.checkOutRoom();
    }
}
