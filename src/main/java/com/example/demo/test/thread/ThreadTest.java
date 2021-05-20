package com.example.demo.test.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTest {

    static Map<String,Object> map = new HashMap<>();
    public static void main(String[] args) {
        String aa = "123";
        String bb = "1" + "2" + "3";
        System.out.println(aa == bb);
        System.out.println(aa.equals(bb));

        Integer integer1 = Integer.valueOf("127");
        Integer integer2 = Integer.valueOf("127");
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

    }

}
