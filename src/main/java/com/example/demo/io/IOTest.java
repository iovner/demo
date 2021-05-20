package com.example.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOTest {

    public static void main(String[] args) throws IOException {
        System.out.println("开始读取文件");
        readFile();
        System.out.println("结束读取文件");
    }

    private static void readFile() throws IOException {
        InputStream inputStream = null;
        inputStream = new FileInputStream("./dd.doc");
        int n;
        while ((n = inputStream.read()) != -1){
            System.out.println(n);
        }
    }

}
