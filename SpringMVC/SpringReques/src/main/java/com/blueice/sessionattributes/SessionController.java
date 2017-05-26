package com.blueice.sessionattributes;

import com.blueice.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/4/18.
 */
@Controller
@SessionAttributes("user") //指定model中的哪些属性需要转存到HttpSession对象当中。
@RequestMapping("/session")
public class SessionController {
    /**
     * 获取请求参数，并存入model中.
     * @param loginName
     * @param password
     * @param userName
     * @param model
     */
    @ModelAttribute
    public void modle(String loginName,String password,String userName, Model model){
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        user.setUserName(userName);
        model.addAttribute("user",user);
    }



    @GetMapping("/get")
    @ResponseBody
    public User setSession(Model model){
        User user = (User) model.asMap().get("user");
        return user;
    }


}
