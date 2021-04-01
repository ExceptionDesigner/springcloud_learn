package com.bobby.cloud.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author: Bobby
 * @create: 2020-04-24 11:12
 * @description: 针对springsecurity的配置文件
 *默认情况下添加SpringSecurity依赖的应用每个请求都需要添加CSRF token才能访问，
 * Eureka客户端注册时并不会添加，所以需要配置/eureka/**路径不需要CSRF token
 *
 **/
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected  void configure(HttpSecurity http) throws Exception{

        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);

    }


}