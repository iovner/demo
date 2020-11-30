package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName：User
 * Package:com.example.demo.entity
 * Description:
 *
 * @Date:2020/11/30 15:19
 * @Author：duzhiguang@bjpowernode.com
 */
@Data
public class User implements Serializable {

    private Long id;
    private String username;
    private String password;

    private Date createTime;
    private Date updateTime;


    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
