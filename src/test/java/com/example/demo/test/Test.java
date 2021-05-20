package com.example.demo.test;

import com.alibaba.cloudapi.sdk.model.HttpClientBuilderParams;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<String,Object> map = new HashMap<>();
        map.put("a","aa");
        System.out.println(map);
    }

    private static void aa(int i) {

        try {
            System.out.println(i);

            if (i == 3) {
                int a = 10/0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
