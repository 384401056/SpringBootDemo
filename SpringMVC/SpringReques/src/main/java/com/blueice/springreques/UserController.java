package com.blueice.springreques;

import com.blueice.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private static List<User> userList;

    public UserController() {
        super();
        this.userList = new ArrayList<User>();
    }


    /**
     * userModel()会优先于其字方法先调用，并接收传过来的@RequestParam参数
     * 如：http://localhost:7766/user/login?loginName=gyb&password=123&userName=Gaoyanbin
     * 参数会先存入model中。
     * @param loginName
     * @param password
     * @param userName
     * @param model
     * @return
     */
    @ModelAttribute
    public String userModel(String loginName,String password,String userName, Model model){
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        user.setUserName(userName);
        model.addAttribute("user",user);
        return "OK";
    }

    /**
     * 从model中取出user对象
     * @param model
     * @return
     */
    @GetMapping("/login")
    @ResponseBody
    public User login(Model model){
         User user =  (User)model.asMap().get("user");
         return user;
    }


    @GetMapping("/login2")
    @ResponseBody
    public User login2(Model model){
        User user =  (User)model.asMap().get("user");
        return user;
    }

}
