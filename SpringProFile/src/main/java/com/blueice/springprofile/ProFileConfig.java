package com.blueice.springprofile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Administrator on 2017/4/5.
 */
@Configuration
public class ProFileConfig {


    @Bean
    @Profile("dev")
    public DemoBean devBean(){
        return new DemoBean("这是一个DevBean");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodBean(){
        return new DemoBean("这是一个ProdBean");
    }


}
