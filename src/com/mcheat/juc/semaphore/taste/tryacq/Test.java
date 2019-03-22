package com.mcheat.juc.semaphore.taste.tryacq;

/**
 * @Author McHeat
 * @Date 2019/3/21 16:13
 * @Version 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        ThreadC c = new ThreadC(service);
        c.setName("C");
        a.start();
        b.start();
        c.start();
    }


}
