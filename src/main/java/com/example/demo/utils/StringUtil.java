package com.example.demo.utils;

import java.net.PortUnreachableException;

public class StringUtil {

    private static final char[] chars = "0123456789ABCDEF".toCharArray();

    public static String byte2String(byte[] data){
        StringBuffer sb = new StringBuffer();
        int v;
        for (int i = 0;i < data.length;i++) {
            v = (data[i] & 0xF0) >> 4;
            sb.append(chars[v]);
            v = (data[i] & 0x0F);
            sb.append(chars[v]);
        }
        return sb.toString().trim();
    }

    public static byte[] string2Bytes(String data){
        byte[] bytes = new byte[data.length() / 2];
        int j = 0;
        for (int i = 0; i < data.length(); i+=2) {
            String sub = data.substring(i, i+2);
            bytes[j] = (byte) Integer.parseInt(sub,16);
            j++;
        }
        return bytes;
    }

}
