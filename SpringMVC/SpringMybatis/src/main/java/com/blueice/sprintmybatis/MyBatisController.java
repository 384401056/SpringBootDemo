package com.blueice.sprintmybatis;

import com.blueice.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/4/20.
 */
@Controller
@RequestMapping("/user")
public class MyBatisController {

    private SqlSessionFactory factory;
    private SqlSession session;

    @RequestMapping(value="/insert", method = RequestMethod.POST)
    @ResponseBody
    public String insert(@RequestBody User user) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();
        session.insert("UserMapper.save",user);
        session.commit();
        session.close();
        return "OK";
    }

    @GetMapping("/selectOne")
    @ResponseBody
    public User selectById(@RequestParam int id) throws IOException{
        User user = new User();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        factory = new SqlSessionFactoryBuilder().build(is);
        session = factory.openSession();
        user = session.selectOne("UserMapper.select",id);
        session.commit();
        session.close();
        return user;
    }


}
