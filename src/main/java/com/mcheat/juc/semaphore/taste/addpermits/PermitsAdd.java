package com.mcheat.juc.semaphore.taste.addpermits;

import java.util.concurrent.Semaphore;

/**
 * @Author McHeat
 * @Date 2019/3/21 17:10
 * @Version 1.0.0
 */
public class PermitsAdd {

    public static void main(String[] args) {
        try {
            Semaphore semaphore = new Semaphore(5);
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            System.out.println(semaphore.availablePermits());
// release次数大于acquire
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            semaphore.release();
            System.out.println(semaphore.availablePermits());
//            一次release多个permits
            semaphore.release(4);
            System.out.println(semaphore.availablePermits());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
