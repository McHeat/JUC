package com.mcheat.juc.semaphore.taste.tryacq;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:09
 * @Version 1.0.0
 */
public class Service {

    /**
     * 公平锁方式的Semaphore，增加permits数量可允许同一时间多线程执行acquire()和release()
     */
    private Semaphore semaphore = new Semaphore(2, true);

    /**
     * 锁获取与释放
     */
    public void testMethod() {
/*        if (semaphore.tryAcquire())  {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "首选进入~");
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                String newString = new String();
                Math.random();
            }
            semaphore.release();
        } else {
            System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入~");
        }*/


        try {
            if (semaphore.tryAcquire(6, TimeUnit.SECONDS)) {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + "首选进入~");
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
                semaphore.release();
            } else {
                System.out.println("ThreadName=" + Thread.currentThread().getName() + "未成功进入~");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
