package com.mcheat.juc.countdown.begin;

import java.util.concurrent.CountDownLatch;

/**
 * @Author McHeat
 * @Date 2019/3/22 16:01
 * @Version 1.0.0
 */
public class MyService {

    private CountDownLatch down = new CountDownLatch(1);

    public void testMothod() {
        try {
            System.out.println("A");
            down.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMethod() {
        System.out.println("X");
        down.countDown();
    }

}
