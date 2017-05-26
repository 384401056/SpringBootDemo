package com.blueice.conversionservice;

import com.blueice.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/20.
 */
@Controller
@RequestMapping("/conv")
public class ConversionController {

    @GetMapping("/reg")
    @ResponseBody
    public User regUser(
            @ModelAttribute User user,
            Model model
    ){
        StringToDateConverter converter = new StringToDateConverter("yyyy-MM-dd HH:mm:ss");
        user.setBirthday(converter.convert("2017-07-23"));
        model.addAttribute("user",user);
        return (User) model.asMap().get("user");
    }


}
