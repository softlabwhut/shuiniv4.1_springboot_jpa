package com.whut.springbootjpacementv4_1.entity;


import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity  //告诉JPA这是一个实体类
@Table(name = "users",uniqueConstraints = {@UniqueConstraint(columnNames={"id", "email"})})
 //指定映射的表名，如果省略，则默认是类的小写名user
public class User
{

    public User(){  //必须要有这个无参构造方法，不然根据UserMapper.xml中的配置，在查询数据库时，将不能反射构造出User实例

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name="username")
    private String username;

    @Column(name="location")
    private String location;

    @Column(name = "status")
    private  Integer status;

    @Column(name = "description")
    private String description;

    @Column(name = "role")
    private Byte role;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Column(name = "remember_token")
    private String remember_token;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }


}

