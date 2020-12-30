package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
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

    @Override
    public int insertUsers(List<User> list) {
        return 0;
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("aa");
        User user2 = new User();
        user2.setUsername("bb");
        User user3 = new User();
        user3.setUsername("cc");
        User user4 = new User();
        user4.setUsername("dd");
        User user5 = new User();
        user5.setUsername("ee");
        List<Boolean> list = new ArrayList<>();
        System.out.println();




        list.add(true);
        list.add(false);
        list.add(true);
        list.add(false);
        list.add(true);

        Object[] objects = list.stream().toArray();
        // 字典项的描述拼接成串，以逗号隔开
        String intentionChannelName = StringUtils.join(objects, ",");
        System.out.println(intentionChannelName);


//        Iterator<User> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getUsername().indexOf("last") == 0) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(list);

    }
}
