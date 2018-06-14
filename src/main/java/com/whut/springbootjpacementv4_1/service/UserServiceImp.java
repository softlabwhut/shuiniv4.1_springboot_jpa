package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.User;
import com.whut.springbootjpacementv4_1.repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;


@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    RegisterServiceImp registerServiceImp;
    //获取表users内所有用户实例，并按id排序
    public List<User> getAll()
    {   //按照id 倒序排序
        return  userRepository.findAll(new Sort(Sort.Direction.ASC,"id"));
    }

    //根据传入的id来查询用户
    public User getUserById(Integer id){

        return userRepository.findUserById(id);
    }
    //根据传入的email查询用户
    public User getUserByEmail(String email){
        return  userRepository.findUserByEmail(email);
    }
    public Result updateUser(User user, String description,String email,String username,Byte role,Integer status)
    {
        //User user1=userRepository.findUserById(user.getId());
        Timestamp nowTimestamp = new Timestamp(new Date().getTime());
        user.setStatus(status);
        user.setUsername(username);
        user.setEmail(email);
        user.setRole(role);
        user.setDescription(description);
        user.setUpdated_at(nowTimestamp);
        userRepository.saveAndFlush(user);
        return new Result(user);

    }

    public String deleteUserById(Integer id){

        //用户若存在，则删除成功，否则提示删除失败
        if(userRepository.findUserById(id)!=null)
        {
            User user=userRepository.getOne(id);
            userRepository.delete(user);
            return "删除成功！";
        }else
            return "删除失败,用户不存在！";
    }

    //根据传入的user实体类创建用户
    public Result addUser(User user){

         //用户若不存在，则创建用户，否则报错
        if (userRepository.findUserById(user.getId())==null&&userRepository.findUserByEmail(user.getEmail())==null) {
            Timestamp nowTimestamp = new Timestamp(new Date().getTime());
            BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
            user.setUpdated_at(nowTimestamp);
            user.setCreated_at(nowTimestamp);
            user.setStatus(1);      //status=1代表用户是激活状态
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));  //将密码加密存储进数据库
            userRepository.save(user);

            return new Result(user);

        }
        else {
            return new Result(102, "用户创建失败！");

        }
    }

   //根据Id检查用户是否已存在
    public boolean existUserById(Integer id){

        return userRepository.existsById(id);


    }
    //根据email地址检查用户是否存在
    public boolean existUserByEmail(String email)
    {
        return userRepository.findUserByEmail(email) == null;
    }
}
