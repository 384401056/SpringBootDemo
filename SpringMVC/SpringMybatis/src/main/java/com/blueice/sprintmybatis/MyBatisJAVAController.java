package com.blueice.sprintmybatis;

import com.blueice.MyBatisUtils;
import com.blueice.bean.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 *
 * 通过java接口的方式调用MyBatis进行数据库的操作。
 * Created by Administrator on 2017/4/21.
 */
@Controller
@RequestMapping("/java")
public class MyBatisJAVAController {

    private SqlSession session;

    @RequestMapping(value="/insert", method = RequestMethod.POST)
    @ResponseBody
    public String insert(@RequestBody User user) {
        try {
            session = MyBatisUtils.getSqlSession(true);
            //得到UserMapperI接口的实现类对象.
            //UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
            IUserMapper mapper = session.getMapper(IUserMapper.class);
            mapper.insert(user);
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
            session = MyBatisUtils.getSqlSession();
            IUserMapper mapper = session.getMapper(IUserMapper.class);
            mapper.update(user);
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
            session = MyBatisUtils.getSqlSession();
            IUserMapper mapper = session.getMapper(IUserMapper.class);
            mapper.deleteById(id);
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
            session = MyBatisUtils.getSqlSession();
            IUserMapper mapper = session.getMapper(IUserMapper.class);
            User user = mapper.getById(id);
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
            session = MyBatisUtils.getSqlSession();
            IUserMapper mapper = session.getMapper(IUserMapper.class);
            List<User> userList = mapper.getAll();
            session.close();
            return userList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
