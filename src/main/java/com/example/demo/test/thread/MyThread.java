package com.example.demo.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread {

//    static AtomicInteger num = new AtomicInteger(0);
//    static int num = 0;
//    static String str = "";
    static StringBuffer str = new StringBuffer();
//    static StringBuilder str = new StringBuilder();
static final Object o = new Object();

    public static void main(String[] args) throws InterruptedException {
//        MyThread1 m1 = new MyThread1();
//        m1.start();

        new Thread(()->{
            for (int i = 0;i < 5000;i++){
//                num.incrementAndGet();
//                num++;
//                str=str+"a";
//                synchronized (o){
                    str.append("a");
//                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0;i < 5000;i++){
//                num.incrementAndGet();
//                num++;
//                str=str+"a";
//                synchronized (o){
                    str.append("a");
//                }
            }
        }).start();
        new Thread(()->{
            for (int i = 0;i < 5000;i++){
//                num.incrementAndGet();
//                num++;
//                str=str+"a";
//                synchronized (o){
                    str.append("a");
//                }
            }
        }).start();

        Thread.sleep(3000);

//        System.out.println(num);
        System.out.println(str.length());

    }

}


