package com.blueice.springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by Administrator on 2017/3/27.
 */
@Configuration
@ComponentScan("com.blueice.springel")
@PropertySource("classpath:com/blueice/springel/test.properties") //注入的
public class ElConfig {

    @Value("I Love You") //注入普通字符.
    private String normal;

    @Value("#{systemProperties['os.name']}") //注入操作系统属性.
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0}") //注入表达式结果.
    private double randomNumber;

    @Value("#{demoServer.another}") //注入其它Bean属性.
    private String fromAnother;

    @Value("classpath:com/blueice/springel/test.txt") //注入文件资源.
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}") //注入配置文件中的内容.
    private String bookName;

    @Autowired
    private Environment environment; //注入

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnother);

        //输出文件内容。
        try {
            String fileString = IOUtils.toString(testFile.getInputStream(), Charset.forName("UTF-8"));
            System.out.println(fileString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(testUrl);
        System.out.println(bookName);

        System.out.println(environment.getProperty("book.author"));
    }
}
