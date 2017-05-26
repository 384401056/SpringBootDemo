package com.blueice.mybatisone2one;

import com.blueice.MyBatisUtils;
import com.blueice.bean.Person;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
@Controller
@RequestMapping(value = "/one2one")
public class One2OneController {

    private static SqlSession session;

    /**
     * 从数据库查询
     * @param id
     * @return
     */
    @GetMapping("/getPerson")
    @ResponseBody
    public Person getPerson(@RequestParam int id){
        try {
            session = MyBatisUtils.getSqlSession(true);
            Person person = session.selectOne("PersonMapper.selectPersonById",id);
            session.commit();
            session.close();
            return person;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Person> getAll(){
        try {
            session = MyBatisUtils.getSqlSession(true);
            IPersonMapper personMapper = session.getMapper(IPersonMapper.class);
            List<Person> list = personMapper.getAll();
            session.close();
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
