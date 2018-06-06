package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.User;
import com.whut.springbootjpacementv4_1.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    LoginRepository loginRepository;

    public Result login(HttpServletRequest request, HttpSession session) {

         String email=request.getParameter("email");
         String password=request.getParameter("password");
         User user=loginRepository.findUserByEmailAndPassword(email,password);

        if (user!=null)
        {
           if ( (user.getEmail()==(email))&&(user.getPassword()==(password)))
           {
               return new  Result(user);

           }
               return new Result(101,"用户名或密码错误");

        }
        else{
               return new Result(100,"用户不存在");

        }
    }
}
