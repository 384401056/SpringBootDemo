package com.blueice.springprofile;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by Administrator on 2017/6/11.
 */
@Configuration
public class MyConfig {

//    @Bean
//    public MongoTemplate mongoTemplate() throws Exception {
//        MongoClient mongoClient = new MongoClient("localhost",27017);
//        UserCredentials user = new UserCredentials("", "");
//        return new MongoTemplate(mongoClient, "itcast", user);
//    }


}
