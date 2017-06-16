package com.blueice.springjpa.controller;

import com.blueice.springjpa.entity.Person;
import com.blueice.springjpa.entity.Student;
import com.blueice.springjpa.entity.User;
import com.blueice.springjpa.repository.PersonMongoRepository;
import com.blueice.springjpa.repository.PersonMySqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Controller
public class MyController {

    @Autowired
    PersonMongoRepository mongoRepository;
    @Autowired
    PersonMySqlRepository mySqlRepository;

    @Autowired
    RedisTemplate<User,String> redisTemplate;

    @Resource(name = "redisTemplate")
    ValueOperations<User,String> valueOperations;

    @RequestMapping("/mongoAge/{age}")
    @ResponseBody
    public List<Student> withFindByAge(@PathVariable String age){
        return mongoRepository.withFindByAge(age);
    }

    @RequestMapping("/mongoName/{name}")
    @ResponseBody
    public Student withFindByName(@PathVariable String name){
        return mongoRepository.findByName(name);
    }

    @RequestMapping("/mysqlName")
    @ResponseBody
    public List<Person> mysqlWithFindByName(){
        return mySqlRepository.findAll();
    }

    @RequestMapping("/redis/{key}")
    @ResponseBody
    public User redisFindKey(@PathVariable String key){
        return template.get
    }
}
