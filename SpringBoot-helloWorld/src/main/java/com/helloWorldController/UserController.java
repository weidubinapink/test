package com.helloWorldController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloWorldDao.UserDao;
import com.helloWorldEntity.User;
import com.helloWorldService.UserService;

@RestController
public class UserController {

  @Autowired
  private UserService userService;
  
  @Autowired
  private UserDao userDao;
  
  @RequestMapping("/createUser")
  public String createUser(String id,String name,Integer age,Integer gender) {
    // 首次启动报错，提示无法扫描出userService，
    // 原因：扫包注解只i扫描helloWorldController包
    // 解决办法：@ComponentScan(basePackages = {"com.helloWorldController","com.helloWorldService"})
    userService.createUser(id, name, age, gender);
    return "index";
  }
  @RequestMapping("/queryUser")
  public User queryUser(Integer id){
    return userDao.findOne(id);
  }
}
