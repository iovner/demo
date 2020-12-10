package com.example.demo.exception;

import com.example.demo.entity.res.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * ClassName：MyExceptionHandler
 * Package:com.example.demo.exception
 * Description:
 *
 * @Date:2020/12/3 16:27
 * @Author：duzhiguang@bjpowernode.com
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public R exceptionHandler(Exception e){
        R r = R.error(e.toString());
        return r;
    }

    @ExceptionHandler(value = {NameException.class})
    public R nameExceptionHandler(Exception e){
        R r = R.error(e.getMessage());
        r.setCode(303);
        return r;
    }

}
