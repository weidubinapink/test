package com.helloWorldEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "test1")
// 这个注解对应数据库表名称
public class User {
  @Id
  @GeneratedValue
  private String id;
  @Column
  private String name;
  @Column
  private Integer age;
  @Column
  private Integer gender;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  public Integer getGender() {
    return gender;
  }
  public void setGender(Integer gender) {
    this.gender = gender;
  }
  
  
}
