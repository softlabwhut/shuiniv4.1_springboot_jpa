package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.User;
import com.whut.springbootjpacementv4_1.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    LoginRepository loginRepository;


     //用户登录业务逻辑简单实现
    public Result login(HttpServletRequest request, HttpServletResponse response,HttpSession session) {

         BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

         String email=request.getParameter("email");
         String rawPassword=request.getParameter("password");//前端传来的密码
         String password=bCryptPasswordEncoder.encode(rawPassword);

         User user=loginRepository.findUserByEmail(email);

        if (user!=null&&bCryptPasswordEncoder.matches(rawPassword,user.getPassword()))//校验密码
        {
               return new  Result(user);
        }
        else{
               return new Result(100,"用户名或密码错误"); //错误代码100代表用户名或密码错误

        }
    }
}
