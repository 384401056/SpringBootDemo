package com.blueice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/25.
 */

@Controller
public class MyController {

    @Autowired
    User user;

    @ResponseBody
    @RequestMapping("/index")
    public User index(){
//        return "user name is "+ user.getName() +"\nuser age is "+user.getAge()+"\nuser sex is "+user.getSex();
        return user;
    }

}
