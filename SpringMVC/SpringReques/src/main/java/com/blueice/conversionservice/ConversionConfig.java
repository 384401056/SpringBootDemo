package com.blueice.conversionservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/4/20.
 */
@Configuration
@ComponentScan("com.blueice.conversionservice")
public class ConversionConfig {

    @Bean
    public StringToDateConverter stringToDateConverter(String datePattern){
       return new StringToDateConverter(datePattern);
    }

}
