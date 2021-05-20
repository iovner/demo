package com.example.demo.proxy.statics;

/**
 * 静态代理
 *   代理类
 */
public class StudentServiceImplProxy implements StudentService{

    // 原始实现类
    private StudentService studentService;

    // 构造方法传入原始实现类
    public StudentServiceImplProxy(StudentService studentService){
        this.studentService = studentService;
    }

    // 代理类也实现接口的方法，再用原始实现类调用接口方法，在原始实现类前后添加代码增强功能
    @Override
    public void insert() {
        System.out.println("事务开始...");
        studentService.insert();
        System.out.println("事务结束...");
    }
}
