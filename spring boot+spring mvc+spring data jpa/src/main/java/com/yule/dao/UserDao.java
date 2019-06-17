package com.yule.dao;

import com.yule.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @Author:yl
 * @Date:2019/6/17 8:23
 * @Version 1.0
 */
public interface UserDao extends JpaRepository<User,Integer> {

}
