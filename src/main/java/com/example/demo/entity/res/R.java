package com.example.demo.entity.res;

import com.example.demo.entity.User;
import lombok.Data;

import java.util.Date;

/**
 * ClassName：R
 * Package:com.example.demo.entity.res
 * Description:
 *
 * @Date:2020/12/3 15:43
 * @Author：duzhiguang@bjpowernode.com
 */
@Data
public class R {


    private int code;
    private String message;
    private Object data;

    public static R success(){
        R r = new R();
        r.setCode(200);
        r.setMessage("成功");
        return r;
    }

    public static R ok(String message){
        R r = new R();
        r.setCode(200);
        r.setMessage(message);
        r.setData(null);
        return r;
    }

    public static R error(String message){
        R r = new R();
        r.setCode(500);
        r.setMessage(message);
        r.setData(null);
        return r;
    }

    public R data(Object data){
        this.data = data;
        return this;
    }


}
