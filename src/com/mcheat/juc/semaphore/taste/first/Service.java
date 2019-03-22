package com.mcheat.juc.semaphore.taste.first;

import java.util.concurrent.Semaphore;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:09
 * @Version 1.0.0
 */
public class Service {

    /**
     * 公平锁方式的Semaphore
     */
    private Semaphore semaphore = new Semaphore(1, true);

    /**
     * 锁获取与释放
     */
    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
