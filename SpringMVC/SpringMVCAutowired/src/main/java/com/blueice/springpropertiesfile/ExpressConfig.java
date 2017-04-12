package com.blueice.springpropertiesfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Administrator on 2017/4/9.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:app.properties") //使用的外部属性文件
public class ExpressConfig {

//    @Autowired
//    private Environment env;
//
//    @Bean
//    public BlankDisc blankDisc(){
//        return new BlankDisc(
//                env.getProperty("title"),
//                env.getProperty("artist"),
//                env.getProperty("count",Integer.class)
//                );
//    }

    /**
     * 为了的@Autowired的情况下，使用占位符@Value,必须配置一个PropertySourcesPlaceholderConfigurer
     * @return
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
