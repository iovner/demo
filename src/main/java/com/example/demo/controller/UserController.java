package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return allUser;
    }


}
