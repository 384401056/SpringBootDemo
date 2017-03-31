package com.blueice.androidtestserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/3/12.
 */

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping
    public String index() {
        return "hello world";
    }

//    @RequestMapping("/get")
//    public String method(){
//        return "get";
//    }

    // @RequestParam 简单类型的绑定，可以get和post
    // http://localhost:8080/index/get?name=Gaoyanbin
    @RequestMapping("/get")
    public HashMap<String, Object> get(@RequestParam String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", "hello world");
        map.put("name", name);
        return map;
    }


    // @PathVariable 获得请求url中的动态参数
    //http://localhost:8080/index/user/999/gaoyanbin
//    @RequestMapping("/user/{id}/{name}")
//    public User getUser(@PathVariable int id, @PathVariable String name) {
//        User user = new User();
//        user.setId(id);
//        user.setName(name);
//        user.setDate(new Date());
//        return user;
//    }
}
