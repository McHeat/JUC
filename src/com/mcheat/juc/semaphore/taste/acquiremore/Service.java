package com.mcheat.juc.semaphore.taste.acquiremore;

import java.util.concurrent.Semaphore;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:09
 * @Version 1.0.0
 */
public class Service {

    /**
     * 公平锁方式的Semaphore，增加permits数量可允许同一时间多线程执行acquire()和release()
     */
    private Semaphore semaphore = new Semaphore(4, true);

    /**
     * 锁获取与释放
     */
    public void testMethod() {
        try {
            semaphore.acquire(2);
            System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
            int sleepValue = (int) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName() + " 停止了" + (sleepValue / 1000) + "秒");
            Thread.sleep(sleepValue);
            System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
            semaphore.release(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
