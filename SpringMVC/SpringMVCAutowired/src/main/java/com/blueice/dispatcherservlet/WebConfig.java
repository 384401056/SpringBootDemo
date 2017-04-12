package com.blueice.dispatcherservlet;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2017/4/11.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.blueice.dispatcherservlet")
public class WebConfig extends WebMvcConfigurerAdapter {



}
