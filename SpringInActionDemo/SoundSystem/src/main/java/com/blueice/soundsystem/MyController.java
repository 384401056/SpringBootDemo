package com.blueice.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/11.
 */
@Controller
public class MyController {

    @Autowired
    private BlankDisc bbb;

    @Autowired
    private CDPlayer cdPlayer;

    @RequestMapping("/cd")
    @ResponseBody
    public BlankDisc getCD(){
        return bbb;
    }

    @RequestMapping("/cdplayer")
    @ResponseBody
    public CDPlayer getplayer(){
        return cdPlayer;
    }

}
