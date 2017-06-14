package com.blueice.springprofile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/11.
 */
@Controller
public class MyController {

    @Autowired
    StudentRepository repository;


    @RequestMapping("/stu/{name}")
    @ResponseBody
    public Student getStu(@PathVariable String name){
        return repository.findByName(name);
    }

}
