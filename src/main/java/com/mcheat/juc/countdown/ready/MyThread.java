package com.mcheat.juc.countdown.ready;

public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testModel();
    }

}
