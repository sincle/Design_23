package com.haieros.design_23.behavior.transaction.audioplay;

/**
 * Created by Kang on 2018/4/9.
 */

public class RewindCommand implements Command {
    private AudioPlay audioPlay;

    public RewindCommand(AudioPlay audioPlay) {
        this.audioPlay = audioPlay;
    }

    @Override
    public void excecute() {
        audioPlay.rewind();
    }
}
