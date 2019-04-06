package com.mcheat.juc.countdown.maxrun;

import java.util.concurrent.CountDownLatch;

/**
 * 多线程与同步点间阻塞
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch maxRunner = new CountDownLatch(10);
        MyThread[] tArray = new MyThread[Integer.parseInt("" + maxRunner.getCount())];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(maxRunner);
            tArray[i].setName("线程" + i);
            tArray[i].start();
        }
        maxRunner.await();
        System.out.println("都返回来了");

    }

}
