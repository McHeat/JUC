package com.mcheat.juc.semaphore.taste.drain;

import java.util.concurrent.Semaphore;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:09
 * @Version 1.0.0
 */
public class Service {

    private Semaphore semaphore = new Semaphore(10);

    /**
     * 锁获取与释放
     */
    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + "" + semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + "" + semaphore.availablePermits());
            System.out.println(semaphore.drainPermits() + "" + semaphore.availablePermits());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "进入catch");
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
