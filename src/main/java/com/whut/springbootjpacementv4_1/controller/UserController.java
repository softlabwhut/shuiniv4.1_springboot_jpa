package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.service.RegisterServiceImp;
import com.whut.springbootjpacementv4_1.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import com.whut.springbootjpacementv4_1.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {
     //创建线程安全的Map
   //static Map<Integer,User> users=Collections.synchronizedMap(new HashMap<>());

   @Autowired
   UserServiceImp userServiceImp;

   @Autowired
   RegisterServiceImp registerServiceImp;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") Integer id)
    {
        //处理 /users/{id}的get请求，用来获取相应单个id的用户
        return userServiceImp.getUserById(id);

    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> getUserList()
    {
        //处理 /users/ 的get请求，获取用户列表
       // List<User> userList=new ArrayList<>(users.values());
        return  userServiceImp.getAll();
    }

    //处理 /users/的post请求 用来创建用户
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result addUser(@ModelAttribute User user,
                          @RequestParam("id")Integer id,
                          @RequestParam("username")String username,@RequestParam("email")String email,
                          @RequestParam("password")String password,@RequestParam("description")String description,
                          @RequestParam("location")String location,@RequestParam("role") Integer role)
    {

        //除了 @ModelAttribute 绑定参数外，还可以通过@RequestParam来传递页面参数
        //users.put(user.getId(),user);
        if (userServiceImp.existUserById(user.getId())|userServiceImp.existUserByEmail(email))
        {
            return  userServiceImp.addUser(user);
        }
        else
            return new Result(102,"用户已存在！");

    }

    //处理 /users/{id} 的put请求，用来更新用户信息
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result putUser (//@ModelAttribute User user,
                          @PathVariable(name = "id") Integer id, @RequestParam(value = "email") String email,
                          @RequestParam("username") String username,@RequestParam("description") String description,
                          @RequestParam("role") Byte role,@RequestParam("status") Integer status)
    {

            if (userServiceImp.getUserById(id) == null) {
                return new Result(103, "用户不存在");
            } else {
                User userOne = userServiceImp.getUserById(id);
                userServiceImp.updateUser(userOne, description, email, username, role, status);
                return new Result(userOne);
            }


    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id){
        //处理 /users/{id} 的delete请求，用来删除相应id的用户

        return  userServiceImp.deleteUserById(id);

    }


}
