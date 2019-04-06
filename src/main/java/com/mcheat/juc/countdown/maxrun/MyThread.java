package com.mcheat.juc.countdown.maxrun;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private CountDownLatch maxRunner;

    public MyThread(CountDownLatch maxRunner) {
        super();
        this.maxRunner = maxRunner;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20000);
            maxRunner.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
