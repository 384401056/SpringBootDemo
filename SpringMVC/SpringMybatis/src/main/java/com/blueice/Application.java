package com.blueice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

/**
 * Created by Administrator on 2017/3/15.
 */

@SpringBootApplication
public class Application implements EmbeddedServletContainerCustomizer {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer config) {
        config.setPort(7766);
    }
}