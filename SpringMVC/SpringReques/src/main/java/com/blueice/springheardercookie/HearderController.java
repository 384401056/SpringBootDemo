package com.blueice.springheardercookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/4/18.
 */
@Controller
public class HearderController {

    /**
     * 获取请求关的参数
     * @param userAgent
     * @param accepts
     * @return
     */
    @GetMapping("/hearder")
    @ResponseBody
    public String hearder(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader("Accept") String[] accepts
    ){
        StringBuilder sb = new StringBuilder();
        sb.append(userAgent);
        for(int i=0;i<accepts.length;i++){
            sb.append(accepts[i]);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * 获取请求的cookie值
     * @param sessionid
     * @return
     */
    @GetMapping("/cookie")
    @ResponseBody
    public String cookie(
            @CookieValue(value = "JSESSIONID", defaultValue = "GYB") String sessionid
    ){
        return sessionid;
    }
}
