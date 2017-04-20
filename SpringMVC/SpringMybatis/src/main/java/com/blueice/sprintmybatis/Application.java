package com.blueice.sprintmybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/3/15.
 */

@SpringBootApplication
public class Application{
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        User user = new User("admin","男",26);
        sqlSession.insert("UserMapper.save",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
