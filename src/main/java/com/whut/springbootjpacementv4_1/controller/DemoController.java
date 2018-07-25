package com.whut.springbootjpacementv4_1.controller;


import com.whut.springbootjpacementv4_1.bean.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen
 * 测试
 */

@Controller
public class DemoController {

    @RequestMapping("/test1")
    public Result demo(String name) {

        System.out.println("前台传值NAME"+name);
        Result result = new Result();
        result.setObject("后台返回值成功");
        return result;
    }
    @RequestMapping("/test2")
    public String demo2(){
        return "JiLian";
    }
}
