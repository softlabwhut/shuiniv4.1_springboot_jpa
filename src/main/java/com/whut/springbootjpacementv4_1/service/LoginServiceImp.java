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
    public Result login(String email,String password) {

         BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();

//        String uPassword=bCryptPasswordEncoder.encode(password);

         User user=loginRepository.findUserByEmail(email);
        System.out.println(password);

        if (user!=null&&bCryptPasswordEncoder.matches(password,user.getPassword()))//校验密码
        {
               return new  Result(user);
        }
        else{
            System.out.println(password);
               return new Result(100,"用户名或密码错误"); //错误代码100代表用户名或密码错误

        }
    }
}
