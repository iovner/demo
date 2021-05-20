package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl2 implements UserService {
    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public int insertUsers(List<User> list) {
        return 0;
    }

    @Override
    public Integer selectCount(String tableName) {
        return null;
    }
}
