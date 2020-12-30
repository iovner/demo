package com.example.demo.test.thread;

public class MyThread1 extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 10; i > -20; i--) {
                System.out.println(i);
                System.out.println(i/i);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("线程执行异常..");
            System.out.println("即将终止线程的声明..................");
        }
    }

}
