package com.example.demo.utils;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import java.util.List;

/**
 * ClassName：MyUtil
 * Package:com.example.demo.utils
 * Description:
 *
 * @Date:2020/12/1 11:35
 * @Author：duzhiguang@bjpowernode.com
 */
public class MyUtil {

    public MyUtil(){}

    private static UserService userService = SpringContextUtil.getBean(UserService.class);

    public static List<User> getAllUser(){
        return userService.getAllUser();
    }

}
