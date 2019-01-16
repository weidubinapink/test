package com.helloWorldController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class IndexController {

  @RequestMapping("/indexController")
  public String indexController(){
    return "index";
  }
}
