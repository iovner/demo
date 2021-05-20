package com.example.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class MyInvocationHandler implements InvocationHandler {

    // 被代理类
    private Object obj;

    public MyInvocationHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("事务开始。。。");
        method.invoke(obj,args);
        System.out.println("事务结束。。。");
        return obj;
    }
}
