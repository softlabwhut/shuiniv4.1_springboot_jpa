package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.service.RegisterServiceImp;
import com.whut.springbootjpacementv4_1.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import com.whut.springbootjpacementv4_1.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.*;
/**
 * @program: springbootjpacementv4_1
 * @description: 用户的增删改查后台接口
 * @author: WuDi
 * @create: 2018-06-29 23:52
 **/
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
    public Result addUser( @RequestBody User user
//            @ModelAttribute User user,
//            @RequestBody String username, @RequestBody String email,
//            @RequestBody String password, @RequestBody String description,
//            @RequestBody String location, @RequestBody Integer role
//
             )
    {

        //除了 @ModelAttribute 绑定参数外，还可以通过@RequestParam来传递页面参数
        //users.put(user.getId(),user);
            return  userServiceImp.addUser(user);

    }

    //处理 /users/{id} 的put请求，用来更新用户信息
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result putUser (
            @ModelAttribute User user,
                          @PathVariable(name = "id",required = false) Integer id, @RequestParam(value = "email") String email,
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
    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    public Result updatePassword(@ModelAttribute User  user,@PathVariable(name = "id",required = false)Integer id,
                                 @RequestParam(value = "password",required = false)String password,
                                 @RequestParam(value = "status")Integer status,
                                 @RequestParam(value = "email")String email,
                                 @RequestParam(value = "username")String username)
    {
        if (userServiceImp.getUserById(id) == null) {
            return new Result(103, "用户不存在");
        } else {
            User userOne = userServiceImp.getUserById(id);
            userServiceImp.updateUserPassword(userOne,password,email,username,status);
            return new Result(userOne);
        }
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id){
        //处理 /users/{id} 的delete请求，用来删除相应id的用户

        return  userServiceImp.deleteUserById(id);

    }


}
