package com.haieros.design_23.behavior.transaction.audioplay;

/**
 * Created by Kang on 2018/4/9.
 * 接收者角色，由录音机类扮演
 */
public class AudioPlay {

    public void play(){
        System.out.println("play...");
    }

    public void rewind(){
        System.out.println("rewind...");
    }
    public void stop(){
        System.out.println("stop...");
    }
}
