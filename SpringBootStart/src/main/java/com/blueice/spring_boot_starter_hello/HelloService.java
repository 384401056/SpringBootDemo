package com.blueice.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator on 2017/5/26.
 */
@ConfigurationProperties(prefix = "hello")
@PropertySource(value = "classpath:hello.properties")
public class HelloService {
    private String msg;

    public String sayHello(){
        return "Hello" + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
