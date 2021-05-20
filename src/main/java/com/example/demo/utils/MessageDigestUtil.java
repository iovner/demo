package com.example.demo.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigestUtil {

    public static final String MD5 = "MD5";
    public static final String SHA1 = "SHA-1";
    public static final String SHA256 = "SHA-256";

    public static byte[] getDigest(String algorithm,byte[] data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(data);
        return messageDigest.digest();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        byte[] hash = getDigest(SHA256, new byte[]{0x01});
        String digest = StringUtil.byte2String(hash);
        System.out.println(digest);
    }
}
