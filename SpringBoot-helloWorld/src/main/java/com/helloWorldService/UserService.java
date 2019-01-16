package com.helloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.helloWorldDao.UserDao;

@Service
public class UserService {

  @Autowired
  private JdbcTemplate jdbcTemplate;
  @Autowired
  private UserDao userDao;
  
  public void createUser(String id,String name,Integer age,Integer gender) {
    
    jdbcTemplate.update("insert into test1 values(?,?,?,?);",id,name,age,gender);
    System.out.println("插入完毕");
  }
  
  public void createJpaUser(String id,String name,Integer age,Integer gender) {
   
    System.out.println("插入完毕");
  }
  
}
