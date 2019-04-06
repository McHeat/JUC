package com.mcheat.juc.semaphore.taste.drain;


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
        a.start();
    }

}
