package com.example.demo.io;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File dir = new File("G:\\aa");
        boolean newFile1 = dir.mkdir();
        System.out.println(newFile1);
        File file = new File("G:\\aa\\a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);



        //需求：我们要在E盘目录下创建一个文件夹demo
//        File file=new File("e:\\demo");
//        System.out.println("mkdir:"+file.mkdir());

        //需求我们要在E盘muludemo下创建一个文件a.txt
//        File file2=new File("e:\\demo\\a.txt");
//        System.out.println("createNewFile:"+file2.createNewFile());

//        File file8=new File("e:\\lawfree\\a.txt");//不会报错，创建的a.txt是一个文件夹
//        System.out.println("mkdirs:"+file8.mkdirs());
    }

}
