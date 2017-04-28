package com.blueice;

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

    /**
     * 获取SqlSession
     * @param isAutoCommit
     *         true 表示创建的SqlSession对象在执行完SQL之后会自动提交事务
     *         false 表示创建的SqlSession对象在执行完SQL之后不会自动提交事务，这时就需要我们手动调用sqlSession.commit()提交事务
     * @return SqlSession
     */
    public static SqlSession getSqlSession(boolean isAutoCommit) throws IOException {
        return getSqlSessionFactory().openSession(isAutoCommit);
    }
}
