package com.mcheat.juc.semaphore.taste.acquiremore;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:13
 * @Version 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        Service service = new Service();

        ThreadA[] a = new ThreadA[10];
        for (int i = 0; i < 10; i++) {
            a[i] = new ThreadA(service);
            a[i].start();
        }
    }
}
