package com.haieros.design_23.behavior.transaction.audioplay;

/**
 * Created by Kang on 2018/4/9.
 */

public class StopCommand implements Command {
    private AudioPlay audioPlay;

    public StopCommand(AudioPlay audioPlay) {
        this.audioPlay = audioPlay;
    }

    @Override
    public void excecute() {
        audioPlay.stop();
    }
}
