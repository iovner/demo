package com.example.demo.exception;

import lombok.Data;

/**
 * ClassName：NameException
 * Package:com.example.demo.exception
 * Description:
 *
 * @Date:2020/12/3 16:23
 * @Author：duzhiguang@bjpowernode.com
 */
@Data
public class NameException extends RuntimeException {

    private static final long serialVersionUID = 1L;


    private String errorCode;
    private String errorType;


    /**
     * 异常信息提示
     * @param message
     * @param errorCode
     */
    public NameException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public NameException(String message,String errorCode,String errorType) {
        super(message);
        this.errorCode = errorCode;
        this.errorType = errorType;
    }

    /**
     * 异常信息提示
     * @param message
     */
    public NameException(String message) {
        super(message);
    }

    /**
     * 异常信息提示
     * @param message
     * @param cause
     */
    public NameException(String message, Throwable cause) {
        super(message, cause);
    }

}
