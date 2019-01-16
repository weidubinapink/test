package com.helloWorldController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// 全局捕获异常类
@ControllerAdvice
public class GlobalExceptionHandler {
  @ExceptionHandler(RuntimeException.class)
  // 标识捕获运行时异常
  @ResponseBody
  // @ResponseBody标识返回json格式；如果想返回页面，不用加@ResponseBody，直接返回String类型
  public Map<String, Object> resultError(){
    Map<String, Object> resultErrorMap = new HashMap<String, Object>();
    resultErrorMap.put("errorCode", "500");
    resultErrorMap.put("errorMeg", "错误。。");
    return resultErrorMap;
  }
}
