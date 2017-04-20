package com.blueice.getjsontojson;

import com.alibaba.fastjson.JSONObject;
import com.blueice.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/4/19.
 */
@Controller
@RequestMapping(value="/json", method = RequestMethod.POST)
public class JsonDataController {

    /**
     * 从请求中获取Json并转为对象.
     * @param book
     * @return
     */
    @GetMapping("/set")
    @ResponseBody
    public Book setJsonData(@RequestBody Book book) {

        book.setAuthor("GaoYanbin");
        return book;
    }

    @GetMapping("/set2")
    @ResponseBody
    public void setJsonData2(@RequestBody Book book, HttpServletResponse response) throws Exception{
        book.setAuthor("dddddd");
        response.setContentType("text/json;charset=UTF-8");//text/json
        response.getWriter().println(JSONObject.toJSONString(book));
    }
}
