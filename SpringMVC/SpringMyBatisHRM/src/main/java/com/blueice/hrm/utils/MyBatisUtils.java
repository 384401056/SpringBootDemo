package com.blueice.hrm.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/4/21.
 */
public class MyBatisUtils {


    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(is);
    }

    public static SqlSession getSqlSession() throws IOException {
        return getSqlSessionFactory().openSession();
    }

    public static SqlSession getSqlSession(Boolean b) throws IOException {
        return getSqlSessionFactory().openSession(b);
    }


}
