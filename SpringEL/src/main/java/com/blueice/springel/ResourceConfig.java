package com.blueice.springel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Administrator on 2017/3/29.
 */
@Configuration
@ComponentScan("com.blueice.springel")
public class ResourceConfig {
    @Bean
    public ElConfig resourceServer(){
        return new ElConfig();
    }

}
