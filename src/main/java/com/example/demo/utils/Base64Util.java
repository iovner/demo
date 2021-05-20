package com.example.demo.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Base64Util {

    // 编码
    public static String encode(String str){
        byte[] bytes = null;
        String result = null;
        try{
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        if (bytes != null) {
            result = new BASE64Encoder().encode(bytes);
        }
        return result;
    }

    // 解码
    public static String decode(String str){
        byte[] bytes = null;
        String result = null;
        if (str != null) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                bytes = decoder.decodeBuffer(str);
                result = new String(bytes,"UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "&";
        String encode = encode(str);
        String decode = decode(encode);
        System.out.println(encode + "\n" + decode);
    }

}
