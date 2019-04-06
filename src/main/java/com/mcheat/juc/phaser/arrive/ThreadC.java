package com.mcheat.juc.phaser.arrive;

import java.util.concurrent.Phaser;

public class ThreadC extends Thread {

    private Phaser phaser;

    public ThreadC(Phaser phaser) {
        super();
        this.phaser = phaser;
    }

    @Override
    public void run() {
        PrintTools.methodB();
    }
}
