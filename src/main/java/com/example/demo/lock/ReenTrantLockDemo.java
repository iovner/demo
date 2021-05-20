package com.example.demo.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantLockDemo {

    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                testSync();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                testSync();
            }
        };

        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }

    private static void testSync() {
        // 如果不加锁，t1，t2同时打印，加了锁，第一个线程睡眠完成后才会执行下个线程
        reentrantLock.lock();
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            reentrantLock.unlock();
        }
    }

}
