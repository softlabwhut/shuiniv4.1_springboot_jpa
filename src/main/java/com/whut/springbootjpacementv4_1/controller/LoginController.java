package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.service.LoginServiceImp;
import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.whut.springbootjpacementv4_1.bean.Result;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    LoginServiceImp loginServiceImp;

    @RequestMapping(value = "/user/ulogin",method = RequestMethod.POST)
    @CrossOrigin(origins = "*",maxAge = 3600)
    public Result uLogin(@RequestBody Map<String,Object> params){
//        String email=request.g("email");
//        String rawpassword=request.getParameter("password");

        String email=params.get("email").toString();
        String password=params.get("password").toString();

        return loginServiceImp.login(email,password);


    }
}
