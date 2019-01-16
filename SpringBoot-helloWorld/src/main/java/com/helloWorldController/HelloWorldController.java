package com.helloWorldController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController标识该接口都返回json格式

@Controller
@RequestMapping("/page")
public class HelloWorldController {

  @RequestMapping("/index")
  public String index(Map<String, Object> map) {
    map.put("name", "SpringBoot");
    return "index";
  }
  
  @RequestMapping("/getMap")
  public Map<String, Object> getMap() {
    Map<String, Object> result = new HashMap<String, Object>();
    result.put("successCode", "200");
    result.put("successMeg", "成功。。");
    return result;
  }
  
  @RequestMapping("/indexTwo")
  public String indexTwo(Map<String, Object> map) {
    map.put("name", "SpringBoot");
    List<String> list = new ArrayList<String>();
    list.add("Spring");
    list.add("Boot");
    map.put("list", list);
    map.put("sex", 1);
    return "indexTwo";
  }

}
