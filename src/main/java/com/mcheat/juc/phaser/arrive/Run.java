package com.mcheat.juc.phaser.arrive;

import java.util.concurrent.Phaser;

public class Run {

    /**
     * 判断awaitAndAwaitAdvance
     *
     * @param args
     */
    public static void main(String[] args) {
        Phaser phaser = new Phaser(3);
        PrintTools.phaser = phaser;

        ThreadA a = new ThreadA(phaser);
        a.setName("A");
        a.start();

        ThreadB B = new ThreadB(phaser);
        B.setName("B");
        B.start();

        ThreadC C = new ThreadC(phaser);
        C.setName("C");
        C.start();

    }

}