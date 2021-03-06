package com.example.demo.controller;

import com.example.demo.config.EnvConfig;
import com.example.demo.config.Properties;
import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.entity.res.R;
import com.example.demo.service.UserService;
import com.example.demo.utils.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.FileNotFoundException;
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

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    private String name;


    @Autowired
    private Properties properties;


    /**
     * 获取所有用户
     * @return 用户集合
     */
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return allUser;
    }

    @RequestMapping("/addUsers")
    public String addUsers(){
        User user1 = new User();
        user1.setId(111l);
        user1.setUsername("aaa");
        user1.setPassword("123456");
        User user2 = new User();
        user2.setId(222l);
        user2.setUsername("bbb");
        user2.setPassword("123456");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        int result = userService.insertUsers(list);
        return "success:" + result;
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

    @RequestMapping("/getAllUserByMyUtil")
    public List<User> getAllUserByMyUtil(){
        return MyUtil.getAllUser();
    }

    @GetMapping("/testDynaTableName")
    public Integer testDynaTableName(@RequestParam("tableName") String tableName){
        return userService.selectCount(tableName);
    }


    @RequestMapping("/testException")
    public R testException(@RequestParam("id") int id) throws FileNotFoundException {

//        int a = 10/id;
//
//        String ss = null;
//        if (id == 1) {
//            ss.equals("");
//        }
//
//        if (id == 3) {
//            throw new NameException("名字异常");
//        }
//
//        InputStream inputStream = new FileInputStream(new File("aaa"));

        bb();
        return R.ok("成功");

    }

    private void bb() {
        throw new NullPointerException("空指针");
    }

}
