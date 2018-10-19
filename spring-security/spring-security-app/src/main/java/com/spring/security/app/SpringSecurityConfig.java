package com.spring.security.app;

import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author sunxiaojun
 * @version 1.0
 * @className SpringSecurityConfig
 * @description TODO
 * @date 2018/10/19 14:42
 **/
@EnableWebSecurity
//@Order(1)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
}
