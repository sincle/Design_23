package com.haieros.design_23.behavior.transaction.audioplay;

/**
 * Created by Kang on 2018/4/9.
 */

public class KeyPad {

    private Command play;
    private Command rewind;
    private Command stop;

    public void setPlay(Command play) {
        this.play = play;
    }

    public void setRewind(Command rewind) {
        this.rewind = rewind;
    }

    public void setStop(Command stop) {
        this.stop = stop;
    }

    public void play(){
        play.excecute();
    }
    public void rewind(){
        rewind.excecute();
    }
    public void stop(){
        stop.excecute();
    }
}
