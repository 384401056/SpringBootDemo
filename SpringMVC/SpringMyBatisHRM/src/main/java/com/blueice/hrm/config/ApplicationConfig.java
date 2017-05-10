package com.blueice.hrm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/5/10.
 */
@Configuration
@ComponentScan("com.blueice.hrm.dao")
public class ApplicationConfig {

//    @Bean
//    public ComboPooledDataSource dataSource(){
//        ComboPooledDataSource ds = new ComboPooledDataSource();
//        try {
//            ds.setDriverClass("com.mysql.cj.jdbc.Driver");
//            ds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/hrm?serverTimezone=UTC");
//            ds.setUser("root");
//            ds.setPassword("123456");
//            ds.setInitialPoolSize(5);
//            ds.setMaxPoolSize(20);
//            ds.setMinPoolSize(5);
//            ds.setMaxStatements(100);
//            ds.setMaxIdleTime(60);
//            ds.setNumHelperThreads(10);
//            ds.setIdleConnectionTestPeriod(60);
//        } catch (PropertyVetoException e) {
//            e.printStackTrace();
//            return null;
//        }
//        return ds;
//    }

//    @Bean
//    public SqlSessionFactory sqlSessionFactory(ComboPooledDataSource dataSource){
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(dataSource);
//        Resource mybatisConf = new FileSystemResource("mybatis-config.xml");
//        sessionFactoryBean.setConfigLocation(mybatisConf);
//        try {
//            SqlSessionFactory sessionFactory = sessionFactoryBean.getObject();
//            return sessionFactory;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }


}
