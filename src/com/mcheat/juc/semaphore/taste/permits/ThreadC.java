package com.mcheat.juc.semaphore.taste.permits;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:11
 * @Version 1.0.0
 */
public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }

}
