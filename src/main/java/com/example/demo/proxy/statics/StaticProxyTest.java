package com.example.demo.proxy.statics;

/**
 * 静态代理：
 *      代理类中需传入一个被代理类
 *      代理类和被代理类共同实现同一个接口的方法
 *      在代理类的实现方法中，添加增强的代码，执行被代理类的方法
 *
 *      缺点：每个实现类都想添加事务，就要针对每个实现类写一个代理类，太麻烦
 *
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        StudentServiceImplProxy proxy = new StudentServiceImplProxy(new StudentServiceImpl());
        proxy.insert();
    }

}
