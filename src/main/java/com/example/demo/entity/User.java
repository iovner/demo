package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javafx.scene.effect.SepiaTone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

/**
 * ClassName：User
 * Package:com.example.demo.entity
 * Description:
 *
 * @Date:2020/11/30 15:19
 * @Author：duzhiguang@bjpowernode.com
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Long id;
    private String username;
    private String password;

    private Date createTime;
    private Date updateTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    public static void main(String[] args) {
        Set set = new HashSet();
        User u1 = new User();
        User u2 = new User();
        u1.setUsername("aa");
        u1.setPassword("1243");

        u2.setUsername("aa");
        u2.setPassword("fds");

        set.add(u1);
        set.add(u2);
        System.out.println(set);

        Map map = new HashMap();
        Object put = map.put("f", "ff");
        Object put1 = map.put("f", "sa");
        System.out.println(put);
        System.out.println(put1);
    }
}
