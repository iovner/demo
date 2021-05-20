package com.example.demo.lock;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class ParkDemo {

    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        // 1.新建线程1执行testSync方法
        Thread t1 = new Thread(){
            @Override
            public void run() {
                testSync();
            }
        };
        t1.setName("t1");
        t1.start();
        try {
            // 3.main线程睡眠3秒钟
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main线程睡眠完成，执行unpark方法叫醒其他线程...");
        // 4.main线程睡眠完成后，唤醒t1线程，让其继续执行
        LockSupport.unpark(t1);

    }

    private static void testSync() {
        System.out.println(Thread.currentThread().getName() + "线程即将park...");
        // 2.线程1执行到下面的park方法，会自动阻塞
        LockSupport.park();
        System.out.println(Thread.currentThread().getName() + "线程被unpark叫醒...");
    }

}
