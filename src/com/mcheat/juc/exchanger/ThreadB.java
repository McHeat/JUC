package com.mcheat.juc.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @Author McHeat
 * @Date 2019/3/22 14:40
 * @Version 1.0.0
 */
public class ThreadB extends Thread {

    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }

    public void run() {
        try {
//            System.out.println("在线程B中得到线程A的值=" + exchanger.exchange("中国人B"));
            System.out.println("在线程B中得到线程A的值=" + exchanger.exchange("中国人B", 2, TimeUnit.SECONDS));
            System.out.println("B end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException ex) {
            ex.printStackTrace();
        }
    }

}
