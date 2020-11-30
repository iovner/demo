package com.example.demo.config;

import com.example.demo.utils.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;

@Slf4j
public class EnvConfig {

    private EnvConfig(){}

    private static Environment environment = SpringContextUtil.getBean(Environment.class);

    public static String getApiKey(){
        return environment.getProperty("properties.hrsc.apiKey");
    }

    public static String getUrl(){
        return environment.getProperty("properties.hrsc.url");
    }

}
