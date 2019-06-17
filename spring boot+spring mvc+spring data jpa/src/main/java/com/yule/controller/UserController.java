package com.yule.controller;

import com.yule.domain.User;
import com.yule.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @Author:yl
 * @Date:2019/6/17 8:35
 * @Version 1.0
 */
@RestController //相当于这两个 @Controller @ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
 private UserService userService;
    @RequestMapping("/findAll")
    public List<User> findAll() {
       List<User> list = userService.findAll();
       return list;
    }
 //传统方式
@RequestMapping("/findOne")
    public User findOneById(Integer id){
      User user=userService.findOneById(id);
      return user;
    }
 //restful风格
/*    @RequestMapping("/findOne/{id}")
 public User findOneById(@PathVariable("id") Integer id) {
     User user = userService.findOneById(id);
     return user;
 }*/
 @RequestMapping("/update")
 public void update(@RequestBody User user) { //// ajax传递json的字符串，json字符串转换成javabean
        userService.update(user);
 }
}
