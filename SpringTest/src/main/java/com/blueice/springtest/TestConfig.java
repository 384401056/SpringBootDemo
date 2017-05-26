package com.blueice.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Administrator on 2017/5/21.
 */
@Configuration
public class TestConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }

}
