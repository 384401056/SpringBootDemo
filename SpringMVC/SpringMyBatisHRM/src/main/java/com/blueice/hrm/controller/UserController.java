package com.blueice.hrm.controller;

import com.blueice.hrm.dao.UserDao;
import com.blueice.hrm.domain.User;
import com.blueice.hrm.service.HrmService;
import com.blueice.hrm.service.impl.HrmServiceImpl;
import com.blueice.hrm.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    private HrmService service = new HrmServiceImpl();

    @GetMapping("/selectById")
    @ResponseBody
    public User selectById(@RequestParam int id){
        return service.findUserById(id);
    }


    @GetMapping("/login")
    @ResponseBody
    public User login(@RequestParam String loginName,@RequestParam String password){
       return service.login(loginName,password);
    }


    @GetMapping("/deleteById")
    @ResponseBody
    public void deleteById(@RequestParam int id){
        service.removeUserById(id);
    }

    @GetMapping("/selectAll")
    @ResponseBody
    public List<User> selectAll(){
        return service.findUser();
    }
}




















