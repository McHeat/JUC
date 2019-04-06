package com.mcheat.juc.cyclicbarrier.begin;

import java.util.concurrent.CyclicBarrier;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("全都到了！");
            }
        });

        MyThread[] threadArray = new MyThread[9];
//        MyThread[] threadArray = new MyThread[10];
//        MyThread[] threadArray = new MyThread[5];
        for (int i = 0; i< threadArray.length; i++) {
            threadArray[i] = new MyThread(cbRef);
        }
        for (int i = 0; i< threadArray.length; i++) {
            threadArray[i].start();
        }

        Thread.sleep(500);
        System.out.println("等待线程数：" + cbRef.getNumberWaiting());
    }
}