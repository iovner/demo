package com.example.demo.utils;

import java.io.*;

public class FileUtil {

    public static byte[] fileToBytes(String fileUrl){
        File file = new File(fileUrl);
        byte[] bytes = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1){
                bos.write(b,0,n);
            }
            fis.close();
            bos.close();
            bytes = bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bytes;
    }

}
