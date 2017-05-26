package com.blueice.dynamicsql;

import com.blueice.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/4/27.
 */
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    private static SqlSession session;
    private HashMap<String, Object> params;


    @GetMapping("/likeId")
    @ResponseBody
    public List<Employee> likeId(@RequestParam int id) {
        params = new HashMap<String, Object>();
        params.put("id", id);
        List<Employee> res = selectEmployeeByIdLike(params);
        return res;
    }

    @GetMapping("/likeAge")
    @ResponseBody
    public List<Employee> likeAge(
            @RequestParam int age
    ) {
        params = new HashMap<String, Object>();
        params.put("age", age);
        List<Employee> res = selectEmployeeByIdLike(params);
        return res;
    }

    @GetMapping("/likeSex")
    @ResponseBody
    public List<Employee> likeSex(@RequestParam String sex) {
        params = new HashMap<String, Object>();
        params.put("sex", sex);
        List<Employee> res = selectEmployeeByIdLike(params);
        return res;
    }

    @GetMapping("/likeNull")
    @ResponseBody
    public List<Employee> likeNull() {
        List<Employee> res = selectEmployeeByIdLike(new HashMap<String, Object>());
        return res;
    }

    @GetMapping("/likeAll")
    @ResponseBody
    public List<Employee> likeAll(
            @RequestParam int age,
            @RequestParam String sex
    ) {
        params = new HashMap<String, Object>();
        params.put("age", age);
        params.put("sex", sex);
        List<Employee> res = selectEmployeeByIdLike(params);
        return res;
    }

    @GetMapping("/updateByid")
    @ResponseBody
    public Employee updateByObject(@RequestParam int id) {
        try {
            session = MyBatisUtils.getSqlSession(true);
            Employee emp = session.selectOne("EmployeeMapper.selectById",id);
            emp.setPassword("00000");
            session.update("EmployeeMapper.updateEmployeeById",emp);
            session.close();
            return emp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @GetMapping("/selectIn")
    @ResponseBody
    public List<Employee> selectEmployeeIn() {
        try {
            session = MyBatisUtils.getSqlSession(true);
            List<Integer> ids = new ArrayList<Integer>();
            ids.add(1);
            ids.add(4);
            List<Employee> emps = session.selectList("EmployeeMapper.selectEmployeeIn",ids);
            session.close();
            return emps;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/selectLikeName")
    @ResponseBody
    public List<Employee> selectEmployeeLikeName() {
        try {
            session = MyBatisUtils.getSqlSession(true);
            Employee emp = new Employee();
            emp.setLoginName("o");
            List<Employee> emps = session.selectList("EmployeeMapper.selectEmployeeLikeName",emp);
            session.close();
            return emps;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Employee> selectEmployeeByIdLike(HashMap<String, Object> params) {
        try {
            session = MyBatisUtils.getSqlSession(true);
            //调用动态SQLMapper
            List<Employee> emps = session.selectList("EmployeeMapper.selectEmployeeByIdLike", params);
            session.close();
            return emps;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Employee> selectLike(HashMap<String, Object> params) {
        try {
            session = MyBatisUtils.getSqlSession(true);
            //调用动态SQLMapper
            List<Employee> emps = session.selectList("EmployeeMapper.selectLike", params);
            session.close();
            return emps;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
