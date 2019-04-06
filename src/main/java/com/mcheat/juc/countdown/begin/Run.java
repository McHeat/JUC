package com.mcheat.juc.countdown.begin;

/**
 * @Author McHeat
 * @Date 2019/3/22 16:04
 * @Version 1.0.0
 */
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread t = new MyThread(myService);
        t.start();
        Thread.sleep(2000);
        myService.downMethod();
    }
}
