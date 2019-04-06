package com.mcheat.juc.countdown.ready;

public class Run {


    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread[] tArray = new MyThread[10];
        for (int i = 0; i < tArray.length; i++) {
            tArray[i] = new MyThread(service);
            tArray[i].setName("线程" + i);
            tArray[i].start();
        }
        Thread.sleep(2000);
        service.downMethod();
    }

}
