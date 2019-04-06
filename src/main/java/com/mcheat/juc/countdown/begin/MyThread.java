package com.mcheat.juc.countdown.begin;

/**
 * @Author McHeat
 * @Date 2019/3/22 16:03
 * @Version 1.0.0
 */
public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMothod();
    }

}
