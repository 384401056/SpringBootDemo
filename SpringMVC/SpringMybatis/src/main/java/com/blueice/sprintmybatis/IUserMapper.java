package com.blueice.sprintmybatis;

import com.blueice.bean.User;
import org.apache.ibatis.annotations.*;

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
    public int deleteById(@Param("id") int userId);//@Param表示给后面的变量取一个参数名.

    //使用@Update注解指明update方法要执行的SQL
    @Update("update tb_user set name=#{name},sex=#{sex},age=#{age} where id=#{id}")
    public int update(User user);

    //使用@Select注解指明getById方法要执行的SQL
    @Select("select * from tb_user where id=#{id}")
    public User getById(int id);

    //使用@Select注解指明getAll方法要执行的SQL
    @Select("select * from tb_user")
    @Results(
            {
              //@Result返回结果的映射,如果列和属性相同则可省略.column是表中的字段，property就User中的属性.
              @Result(id = true,column = "id",property = "id"),
              @Result(column = "sex",property = "name"),
              @Result(column = "name",property = "sex")
            }
    )
    public List<User> getAll();

}
