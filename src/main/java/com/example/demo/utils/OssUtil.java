package com.example.demo.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;

import java.io.ByteArrayInputStream;

/**
 * ClassName：OssUtil
 * Package:com.example.demo.utils
 * Description:
 *
 * @Date:2020/11/30 16:45
 * @Author：duzhiguang@bjpowernode.com
 */
public class OssUtil {


    private static final String ENDPOINT = "https://oss-cn-beijing.aliyuncs.com";
    private static final String ACCESS_KEY_ID = "LTAI4GB32mSWG2NceyX3qs7g";
    private static final String ACCESS_KEY_SECRET = "QYW1TlQT7Tg5nz448FvvosCSZE68RQ";
    private static final String BUCKET_NAME = "edu-guli-20200918";

    public static void createBucket(){
        OSS client = new OSSClientBuilder().build(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        client.createBucket(BUCKET_NAME);
        client.shutdown();
    }

    public static void uploadFile(){
        String objectName = "G:\\勤务通打卡用户手册20200112(1).pdf";
        String content = "Hello OSS";
        OSS client = new OSSClientBuilder().build(ENDPOINT, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        client.putObject(BUCKET_NAME, objectName, new ByteArrayInputStream(content.getBytes()));
        client.shutdown();
    }

    public static void main(String[] args) {
        uploadFile();
    }


}
