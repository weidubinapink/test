package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"com.helloWorldController","com.helloWorldService"})
@EnableJpaRepositories("com.helloWorldDao")
// jpa独有的扫包方式
@EntityScan("com.helloWorldEntity")
// 扫实体类注解
@EnableAutoConfiguration
@SpringBootApplication
public class App {

  public static void main(String[] args) {
    // 主函数，运行SpringBoot项目，程序入口
    SpringApplication.run(App.class, args);
  }
}
