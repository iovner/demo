package com.example.demo.config;

import com.example.demo.entity.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

@Data
@Component
@ConfigurationProperties(prefix = "properties.hrsc")
public class Properties {

    private  String apiKey;
    private  String url;

    public static void main(String[] args) {
       String imgFile = "D:/Program Files/WeChat/WeChat.exe";
        InputStream inputStream = null;
        byte[] data = null;
        try {
            inputStream = new FileInputStream(imgFile);
            data = new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String s = String.valueOf(data);
        System.out.println(s);
        // 加密
        BASE64Encoder encoder = new BASE64Encoder();
        String result =  encoder.encode(data);
        System.out.println(result);
      generateImage(result,"D:/WeChat.exe");
    }


    public static boolean generateImage(String imgStr, String path) {
        if (imgStr == null)
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // 解密
            byte[] b = decoder.decodeBuffer(imgStr);
            // 处理数据
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(path);
            out.write(b);
            out.flush();
            out.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
