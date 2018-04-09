package com.haieros.design_23.behavior.transaction.audioplay;

/**
 * Created by Kang on 2018/4/9.
 */

public class Client {

    public static void main(String[] agrs){

        //创建接受者
        AudioPlay audioPlay = new AudioPlay();

        //创建命令对象
        PlayCommand playCommand = new PlayCommand(audioPlay);
        RewindCommand rewindCommand = new RewindCommand(audioPlay);
        StopCommand stopCommand = new StopCommand(audioPlay);

        //创建请求者对象
        KeyPad keyPad = new KeyPad();
        keyPad.setPlay(playCommand);
        keyPad.setRewind(rewindCommand);
        keyPad.setStop(stopCommand);

        keyPad.play();
        keyPad.rewind();
        keyPad.stop();
    }
}
