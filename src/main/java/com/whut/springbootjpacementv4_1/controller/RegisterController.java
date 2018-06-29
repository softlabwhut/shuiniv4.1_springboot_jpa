package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.service.RegisterServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * @program: springbootjpacementv4_1
 * @description: 注册用户后台接口
 * @author: WuDi
 * @create: 2018-06-29 23:52
 **/
@RestController
@RequestMapping(value = "/users")
public class RegisterController {
    @Autowired
     RegisterServiceImp registerServiceImp;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Result userRegister(HttpServletRequest request, HttpServletResponse response,HttpSession session){

         return  registerServiceImp.userRegister(request, response, session);

    }

}
