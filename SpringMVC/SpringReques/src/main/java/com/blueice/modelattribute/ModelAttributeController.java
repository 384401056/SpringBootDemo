package com.blueice.modelattribute;

import com.blueice.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/4/18.
 */

@Controller
@RequestMapping("/ma")
public class ModelAttributeController {

//    @ModelAttribute
//    public void model(
//        @RequestParam("loginName") String loginName,
//        @RequestParam("password") String password,
//        @RequestParam("userName") String userName,
//        Model model
//    ){
//        model.addAttribute("loginName",loginName);
//        model.addAttribute("password",password);
//        model.addAttribute("userName",userName);
//    }
//
//    @GetMapping("/get")
//    @ResponseBody
//    public User getUser(Model model){
//        User user = new User();
//        user.setLoginName((String) model.asMap().get("loginName"));
//        user.setPassword((String) model.asMap().get("password"));
//        user.setUserName((String) model.asMap().get("userName"));
//        return user;
//    }

    /**
     * 使用@ModelAttribute和 @GetMapping同时注解一个方法
     * @param loginName
     * @param password
     * @param userName
     * @return
     */


//    @ModelAttribute
    @GetMapping("/get")
    @ResponseBody
    public User getUser(
            @RequestParam("loginName") String loginName,
            @RequestParam("password") String password,
            @RequestParam("userName") String userName,
            Model model){
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        user.setUserName(userName);
//        model.addAttribute("user",user);
//        return (User) model.asMap().get("user");
        return user;
    }

    @GetMapping("/set")
    @ResponseBody
    public String setUser(Model model){
        return "OK";
    }
}
