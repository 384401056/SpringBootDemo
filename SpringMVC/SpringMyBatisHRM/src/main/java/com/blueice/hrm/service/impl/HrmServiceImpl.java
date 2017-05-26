package com.blueice.hrm.service.impl;

import com.blueice.hrm.dao.UserDao;
import com.blueice.hrm.domain.User;
import com.blueice.hrm.service.HrmService;
import com.blueice.hrm.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10.
 */
public class HrmServiceImpl implements HrmService {

    @Transactional(readOnly = true)
    @Override
    public User login(String loginName, String password) {
        User res = null;
        try {
            SqlSession session = MyBatisUtils.getSqlSession(true);
            UserDao userDao = session.getMapper(UserDao.class);
            res = userDao.selectByLoginnameAndPassword(loginName,password);
            session.close();
            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Transactional(readOnly = true)
    @Override
    public User findUserById(int id) {
        User res = null;
        try {
            SqlSession session = MyBatisUtils.getSqlSession(true);
            UserDao dao = session.getMapper(UserDao.class);
            res = dao.selectById(id);
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findUser() {
        List<User> resList = null;
        try {
            SqlSession session = MyBatisUtils.getSqlSession(true);
            UserDao userDao = session.getMapper(UserDao.class);
            resList = userDao.selectAll();
            session.close();
            return resList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resList;
    }

    @Override
    public void removeUserById(int id) {
        try {
            SqlSession session = MyBatisUtils.getSqlSession(true);
            UserDao userDao = session.getMapper(UserDao.class);
//            int res = userDao.deleteById(id);
            session.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modifyUser(User user) {

    }

    @Override
    public void addUser(User user) {

    }
}
