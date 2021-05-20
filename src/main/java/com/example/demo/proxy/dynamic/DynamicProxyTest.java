package com.example.demo.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    public static void main(String[] args) {
        // 原始实现类
        //GoodsService goodsService = new GoodsServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        // 传入代理类中
        InvocationHandler handler = new MyInvocationHandler(orderService);
        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(handler.getClass().getClassLoader(), orderService.getClass().getInterfaces(), handler);
        orderServiceProxy.insert();

    }

}
