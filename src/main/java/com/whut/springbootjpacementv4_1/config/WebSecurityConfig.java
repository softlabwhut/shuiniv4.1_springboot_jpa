package com.whut.springbootjpacementv4_1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
/**
 * @program: springbootjpacementv4_1
 * @description: spring security的基本配置文件
 * @author: WuDi
 * @create: 2018-06-29 23:52
 **/
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = false)//允许进入页面方法前检验
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;//自定义用户服务
    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
            http.authorizeRequests()//配置安全策略
                .antMatchers("/","/hello","/articles","/company","/users").permitAll()//定义/请求不需要验证
                .anyRequest().permitAll()//其余的所有请求都不需要验证
                .and()
                .logout()
                .permitAll()//定义logout不需要验证
                .and()
                .formLogin();//使用form表单登录
    }
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        //auth.inMemoryAuthentication().withUser("TEST").password("123456").roles("ADMIN");
//        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());//code5
//        auth.eraseCredentials(false);
//    }
}