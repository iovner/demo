package com.example.demo.fastjson;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName：FastJsonTest
 * Package:com.example.demo.fastjson
 * Description:
 *
 * @Date:2020/12/1 21:05
 * @Author：duzhiguang@bjpowernode.com
 */
public class FastJsonTest {

    public static void main(String[] args) {


        User user = new User(100l,"admin","admin",new Date(),new Date());
        String string = object2String(user);
        System.out.println("user = " + string);

        List<User> users = new ArrayList<>();
        users.add(new User(100l,"admin","admin",new Date(),new Date()));
        users.add(new User(200l,"admin1","admin1",new Date(),new Date()));
        String list2String = objList2String(users);
        System.out.println("users = " + list2String);

        User user3 = new User(300l,"admin3","admin3",new Date(),new Date());
        String s = JSON.toJSONString(user3);
        User user4 = JSON.parseObject(s,User.class);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user3 == user4);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+j*i);
                System.out.print("     ");
            }
            System.out.println();
        }


    }

    /**
     * java对象转json字符串
     * @param user
     * @return
     */
    public static String object2String(User user){
        return JSON.toJSONString(user);
    }

    /**
     * java集合对象转json字符串
     * @param users
     * @return
     */
    public static String objList2String(List<User> users){
        return JSON.toJSONString(users);
    }



}
