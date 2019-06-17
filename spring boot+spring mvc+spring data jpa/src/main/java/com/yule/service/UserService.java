package com.yule.service;

import com.yule.domain.User;

import java.util.List;

/**
 * @Author:yl
 * @Date:2019/6/17 8:25
 * @Version 1.0
 */
public interface UserService {
     List<User> findAll();
     User findOneById(Integer id);
     void update(User user);
}
