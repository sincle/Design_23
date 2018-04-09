package com.haieros.design_23.behavior.transaction.audioplay;

/**
 * Created by Kang on 2018/4/9.
 */

public class PlayCommand implements Command {
    private AudioPlay audioPlay;
    public PlayCommand(AudioPlay audioPlay){
        this.audioPlay = audioPlay;
    }
    @Override
    public void excecute() {
        audioPlay.play();
    }
}
