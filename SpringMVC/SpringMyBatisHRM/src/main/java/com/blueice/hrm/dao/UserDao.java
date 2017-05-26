package com.blueice.hrm.dao;

import com.blueice.hrm.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import static com.blueice.hrm.common.HrmConstants.USERTABLE;

/**
 * Created by Administrator on 2017/5/9.
 */
public interface UserDao {

    /**
     * 根据登陆名和密码查询用户
     * @param loginName
     * @param password
     * @return
     */
    @Select("select * from " + USERTABLE + " where loginname = #{loginName} and password = #{password}")
    User selectByLoginnameAndPassword(@Param("loginName") String loginName, @Param("password") String password);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Select("select * from " + USERTABLE + " where id = #{id}")
    User selectById(@Param("id") int id);

    @Select("select * from "+ USERTABLE)
    List<User> selectAll();


    /**
     * 根据id删除用户
     * @param id
     */
    @Select("delete from " + USERTABLE + " where id = #{id}")
    int deleteById(@Param("id") int id);


}
