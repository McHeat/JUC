package com.mcheat.juc.semaphore.taste.uninterruptibly;

import java.util.concurrent.Semaphore;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:09
 * @Version 1.0.0
 */
public class Service {

    private Semaphore semaphore = new Semaphore(1);

    /**
     * 锁获取与释放
     */
    public void testMethod() {
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
        while (true) {
            String newString = new String();
            int stopFlag = (int) (Math.random() * 100000);
//                System.out.println(stopFlag);
            if (stopFlag == Integer.MAX_VALUE) {
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
        semaphore.release();
/*        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin timer=" + System.currentTimeMillis());
            while (true) {
                String newString = new String();
                int stopFlag = (int) (Math.random() * 100000);
//                System.out.println(stopFlag);
                if (stopFlag == Integer.MAX_VALUE) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " end timer=" + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "进入catch");
            e.printStackTrace();
        }*/
    }
}
