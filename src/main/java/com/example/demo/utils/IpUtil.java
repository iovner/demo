package com.example.demo.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpUtil {

    /**
     * 获取当前机器IP地址
     * @return
     */
    public static String getIpAddress(){
        try {
            InetAddress address = InetAddress.getLocalHost();
            return address.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        String ipAddress = getIpAddress();
        System.out.println(ipAddress);
    }
}
