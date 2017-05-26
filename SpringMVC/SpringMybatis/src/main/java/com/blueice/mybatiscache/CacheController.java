package com.blueice.mybatiscache;

import com.blueice.MyBatisUtils;
import com.blueice.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/4/25.
 */
@Controller
@RequestMapping("/Cache")
public class CacheController {

    private static SqlSession session;

    @GetMapping("/selectById")
    @ResponseBody
    public User selectById(@RequestParam int id)
    {
        try {
            session = MyBatisUtils.getSqlSession(true);
            User user = session.selectOne("UserMapper.select",id);
            session.close();
            return user;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping(value = "/getAll")
    @ResponseBody
    public List<User> getAll(){
        try {
            session = MyBatisUtils.getSqlSession(true);
            List<User> userList = session.selectList("UserMapper.getAll");
            session.close();
            return userList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
