package com.blueice.hrm.service;

import com.blueice.hrm.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
@Service
public interface HrmService {

    /**
     * 用户登陆
     * @param loginName
     * @param password
     * @return User 对象
     */
    User login(String loginName, String password);

    /**
     * 根据id查询用户名
     * @param id
     * @return User对象
     */
    User findUserById(int id);

    /**
     * 获取所有用户.
     * @return
     */
    List<User> findUser();


    /**
     *根据id删除用户
     * @param id
     */
    void removeUserById(int id);

    void modifyUser(User user);

    void addUser(User user);

}


























