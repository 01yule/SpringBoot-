package com.yule.service.impl;

import com.yule.dao.UserDao;
import com.yule.domain.User;
import com.yule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:yl
 * @Date:2019/6/17 8:29
 * @Version 1.0
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOneById(Integer id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);//save方法有id就是新增，没id就是修改
    }
}
