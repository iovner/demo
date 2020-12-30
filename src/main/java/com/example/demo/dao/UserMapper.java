package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName：UserMapper
 * Package:com.example.demo.dao
 * Description:
 *
 * @Date:2020/11/30 15:11
 * @Author：duzhiguang@bjpowernode.com
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    Integer selectCount(@Param("tableName") String tableName);
}
