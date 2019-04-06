package com.mcheat.juc.semaphore.taste.uninterruptibly;

/**
 * @Author McHeat
 * @Date 2019/3/21 17:24
 * @Version 1.0.0
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

        Thread.sleep(1000);
        /**
         * 1. 线程A占用了锁，如果线程B使用acquire()获取则可被interrupt()中断
         * 2. 线程A占用了锁，如果线程B使用acquireUninterruptibly()获取则不可被interrupt()中断
         */
        b.interrupt();
        System.out.println("main中断了b");
    }
}
