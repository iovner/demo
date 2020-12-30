package com.example.demo.config;

import com.example.demo.entity.User;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "properties.hrsc")
public class Properties {

    private  String apiKey;
    private  String url;

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
    }

}
