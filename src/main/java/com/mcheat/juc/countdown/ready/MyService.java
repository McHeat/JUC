package com.mcheat.juc.countdown.ready;

import java.util.concurrent.CountDownLatch;

public class MyService {

    private CountDownLatch down = new CountDownLatch(1);

    public void testModel() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备");
            down.await();
            System.out.println(Thread.currentThread().getName() + "结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMethod() {
        System.out.println("开始");
        down.countDown();
    }
}
