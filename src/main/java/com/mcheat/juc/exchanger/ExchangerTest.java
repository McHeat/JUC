package com.mcheat.juc.exchanger;

import java.util.concurrent.Exchanger;

/**
 * @Author McHeat
 * @Date 2019/3/22 14:44
 * @Version 1.0.0
 */
public class ExchangerTest {

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger();
        ThreadA a = new ThreadA(exchanger);
        ThreadB b = new ThreadB(exchanger);
//        a.start();
        b.start();
        System.out.println("main end");
    }

}
