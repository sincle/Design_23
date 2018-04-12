package com.haieros.design_23.behavior.state.state;

/**
 * Created by Kang on 2018/4/12.
 */

public class Room {
    private State state;
    private State freeState;
    private State checkInState;
    private State bookedState;

    public Room() {
        freeState = new FreeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);

        state = freeState;
    }

    public void bookRoom() {
        state.bookRoom();
    }

    public void unsubscribeRoom() {
        state.unsubscribeRoom();
    }

    public void checkInRoom() {
        state.checkInRoom();
    }

    public void checkOutRoom() {
        state.checkOutRoom();
    }

    public String toString() {
        return "该房间的状态:" + getState().getClass().getName();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getFreeState() {
        return freeState;
    }

    public void setFreeState(State freeState) {
        this.freeState = freeState;
    }

    public State getCheckInState() {
        return checkInState;
    }

    public void setCheckInState(State checkInState) {
        this.checkInState = checkInState;
    }

    public State getBookedState() {
        return bookedState;
    }

    public void setBookedState(State bookedState) {
        this.bookedState = bookedState;
    }
}
