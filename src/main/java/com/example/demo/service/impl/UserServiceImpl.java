package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName：UserServiceImpl
 * Package:com.example.demo.service.impl
 * Description:
 *
 * @Date:2020/11/30 15:10
 * @Author：duzhiguang@bjpowernode.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.findAll();
    }

    @Override
    public Integer selectCount(String tableName) {
        return userMapper.selectCount(tableName);
    }
}
