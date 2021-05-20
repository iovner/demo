package com.example.demo.proxy.statics;

/**
 * 静态代理
 *   原始实现类
 */
public class StudentServiceImpl implements StudentService{

    @Override
    public void insert() {
        System.out.println("添加学生");
    }
}
