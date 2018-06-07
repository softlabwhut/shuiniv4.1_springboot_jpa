package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.service.LoginServiceImp;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.whut.springbootjpacementv4_1.bean.Result;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    LoginServiceImp loginServiceImp;

    @RequestMapping(value = "/user/ulogin",method = RequestMethod.POST)
    public Result uLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session){

        return loginServiceImp.login(request,response,session);

    }
}
