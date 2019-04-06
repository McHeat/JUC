package com.mcheat.juc.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Author McHeat
 * @Date 2019/3/22 14:40
 * @Version 1.0.0
 */
public class ThreadA extends Thread {

    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    public void run() {
        try {
            System.out.println("在线程A中得到线程B的值=" + exchanger.exchange("中国人A"));
            System.out.println("A end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
