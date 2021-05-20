package com.example.demo.proxy.dynamic;

public class OrderServiceImpl implements OrderService{
    @Override
    public void insert() {
        System.out.println("添加订单");
    }
}
