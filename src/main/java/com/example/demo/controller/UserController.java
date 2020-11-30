package com.example.demo.controller;

import com.example.demo.config.EnvConfig;
import com.example.demo.config.Properties;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName：UserController
 * Package:com.example.demo.controller
 * Description:
 *
 * @Date:2020/11/30 15:08
 * @Author：duzhiguang@bjpowernode.com
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Autowired
    private Properties properties;

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return allUser;
    }

    @RequestMapping("/getFromProperties")
    public List<String> getProperties(){
        List<String> result = new ArrayList<>();
        result.add(properties.getApiKey());
        result.add(properties.getUrl());
        return result;
    }

    @RequestMapping("/getFromEnv")
    public List<String> getFromEnv(){
        List<String> result = new ArrayList<>();
        result.add(EnvConfig.getApiKey());
        result.add(EnvConfig.getUrl());
        return result;
    }


}
