package com.mcheat.juc.semaphore.taste.uninterruptibly;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:11
 * @Version 1.0.0
 */
public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }

}