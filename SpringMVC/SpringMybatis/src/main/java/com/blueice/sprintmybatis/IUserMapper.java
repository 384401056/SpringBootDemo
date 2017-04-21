package com.blueice.sprintmybatis;

import com.blueice.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */
public interface IUserMapper {

    //使用@Insert注解指明add方法要执行的SQL
    @Insert("insert into tb_user(name, age) values(#{name}, #{age})")
    public int insert(User user);

    //使用@Delete注解指明deleteById方法要执行的SQL
    @Delete("delete from tb_user where id=#{id}")
    public int deleteById(int id);

    //使用@Update注解指明update方法要执行的SQL
    @Update("update tb_user set name=#{name},sex=#{sex},age=#{age} where id=#{id}")
    public int update(User user);

    //使用@Select注解指明getById方法要执行的SQL
    @Select("select * from tb_user where id=#{id}")
    public User getById(int id);

    //使用@Select注解指明getAll方法要执行的SQL
    @Select("select * from tb_user")
    public List<User> getAll();

}
