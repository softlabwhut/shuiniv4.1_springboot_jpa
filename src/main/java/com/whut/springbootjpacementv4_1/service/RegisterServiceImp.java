package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.User;
import com.whut.springbootjpacementv4_1.repository.RegisterRepository;
import com.whut.springbootjpacementv4_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.sql.Timestamp;

@Service
public class RegisterServiceImp implements RegisterService{

    @Autowired
    RegisterRepository registerRepository;

    @Autowired
    UserRepository userRepository;

    public Result userRegister(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
        //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String email = request.getParameter("email");
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        Byte   role =Byte.valueOf(request.getParameter("role"));
        String userSession=session.getId();
        String description= request.getParameter("description");
        String location=request.getParameter("location");
        // new Date()为获取当前系统时间，也可使用当前时间戳
        Timestamp nowTimestamp = new Timestamp(new Date().getTime());

        //Integer status=Integer.parseInt(request.getParameter("status"));

        //email 字段必须唯一，若email已被注册，代表用户已存在
        if (userRepository.findUserByEmail(email)!=null){
            return  new Result(101,"用户已存在！");    //错误代码101表示用户已存在
        }else{
            User user = new User();

            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            user.setRole(role);
            user.setDescription(description);
            user.setRemember_token(userSession);
            user.setCreated_at(nowTimestamp);
            user.setUpdated_at(nowTimestamp);
            //user.setStatus(status);
            user.setLocation(location);

            registerRepository.save(user);


            return  new Result(user);
        }

    }
}
