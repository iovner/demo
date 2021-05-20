package com.example.demo.test.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程的顺序执行
 */
public class ThreadSeqRunTest {

    static Thread t1 = new Thread(() -> {
        System.out.println("t1---运行");
    });

    static Thread t2 = new Thread(() -> {
        System.out.println("t2---运行");
    });

    static Thread t3 = new Thread(() -> {
        System.out.println("t3---运行");
    });

    static Thread t4 = new Thread(() -> {
        System.out.println("t4---运行");
    });

    static Thread t5 = new Thread(() -> {
        System.out.println("t5---运行");
    });

    static ExecutorService pool = Executors.newSingleThreadExecutor();


    public static void main(String[] args) throws InterruptedException {
//        /**
//         * 1.使用join方法让一个线程强制运行
//         *
//         *   join方法的主要作用就是同步，它可以使得线程之间的并行执行变为串行执行。在A线程中调用了B线程的join()方法时，
//         *   表示只有当B线程执行完毕时，A线程才能继续执行。
//         *
//         *   如果A线程中掉用B线程的join(10)，则表示A线程会等待B线程执行10毫秒，10毫秒过后，A、B线程并行执行
//         *   join(0)的意思不是A线程等待B线程0秒，而是A线程等待B线程无限时间，直到B线程执行完毕，即join(0)等价于join()
//         */
//        System.out.println("main线程开始运行");
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();
//        t3.join();
//        t4.start();
//        t4.join();
//        t5.start();
//        t5.join();
//        System.out.println("main线程结束运行");

        /**
         * 2.使用juc包下的Executors线程池保证子线程按顺序执行
         *   使用newSingleThreadExecutor()方法创建的线程池可以使放到它里面的子线程按一定顺序执行，但是不能保证子线程和主线程(main线程)的执行顺序。
         *   原理：
         *      newSingleThreadExecutor()方法创建的是一个基于FIFO先进先出的队列，也就是，t1，t2，t3加入队列时，实际在就绪状态的只有t1，t1线程
         *      执行完成后，才会顺序执行t2，t3
         */
        System.out.println("main线程开始运行");
        pool.submit(t1);
        pool.submit(t2);
        pool.submit(t3);
        pool.submit(t4);
        pool.submit(t5);
        pool.shutdown();
        System.out.println("main线程结束运行");


        int num = 6;
        int res = jiecheng(num);
        System.out.println(res);



    }

    /**
     *
     * @param num
     * @return
     */
    private static int jiecheng(int num) {
        if (num == 1) {
            return 1;
        } else {
            return jiecheng(num - 1)*num;
        }
    }


}
