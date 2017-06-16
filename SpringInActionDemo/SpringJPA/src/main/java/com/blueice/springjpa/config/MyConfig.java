package com.blueice.springjpa.config;

import com.blueice.springjpa.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/6/16.
 */
@Configuration
public class MyConfig {

    @Bean
    public RedisConnectionFactory redisConnectionFactory(){
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<User,String> redisTemplate() throws UnknownHostException{
        RedisTemplate<User,String> template =  new RedisTemplate<User,String>();
        template.setConnectionFactory(redisConnectionFactory());
        return template;
    }

}
