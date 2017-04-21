package com.blueice.sprintmybatis;

import com.blueice.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 *
 * 通过xml配置文件来调用MyBatis进行数据库的操作。
 * Created by Administrator on 2017/4/20.
 */
@Controller
@RequestMapping("/xml")
public class MyBatisXMLController {

    private SqlSession session ;

    @RequestMapping(value="/insert", method = RequestMethod.POST)
    @ResponseBody
    public String insert(@RequestBody User user) {
        try {
            session = MyBatisUtils.getSqlSession(true);
            session.insert("UserMapper.save",user);
            session.commit();
            session.close();
            return "OK";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }

    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public User update(@RequestBody User user) {
        try {
            session = MyBatisUtils.getSqlSession(true);
            session.update("UserMapper.update",user);
            session.commit();
            session.close();
            return user;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @RequestMapping(value = "/delete")
    @ResponseBody
    public String delete(@RequestParam int id){
        try {
            session = MyBatisUtils.getSqlSession(true);
            session.delete("UserMapper.delete",id);
            session.commit();
            session.close();
            return "OK";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }

    }

    @RequestMapping(value = "/selectOne")
    @ResponseBody
    public User selectById(@RequestParam int id){
        try {
            session = MyBatisUtils.getSqlSession(true);
            User user = session.selectOne("UserMapper.select",id);
            session.commit();
            session.close();
            return user;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<User> getAll(){
        try {
            session = MyBatisUtils.getSqlSession(true);
            List<User> userList = session.selectList("UserMapper.getAll");
            session.commit();
            session.close();
            return userList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}



























