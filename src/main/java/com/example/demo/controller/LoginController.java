package com.example.demo.controller;

import com.example.demo.entity.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName：LoginController
 * Package:com.example.demo.controller
 * Description:
 *
 * @Date:2020/12/1 10:32
 * @Author：duzhiguang@bjpowernode.com
 */
@RestController
@RequestMapping("/")
public class LoginController {


    @RequestMapping("/")
    public String login(){
        return "welcome login page!";
    }

    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        userModel.setAa("aa");
        System.out.println(userModel);
    }
}
