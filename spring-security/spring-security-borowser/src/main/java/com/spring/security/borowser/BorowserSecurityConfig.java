package com.spring.security.borowser;

import com.spring.security.core.properties.SecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * SpringSecurity 配置
 */
@Configuration
public class BorowserSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private SecurityProperties securityProperties;

    @Autowired
    protected AuthenticationSuccessHandler springSecurityAuthenctiationSuccessHandler;

    @Autowired
    protected AuthenticationFailureHandler springSecurityAuthenctiationFailureHandler;
    /**
     * 配置拦截
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                /**
                 * 自定义登录页面
                 * /authentication/require
                 */
                .loginPage("/authentication/require")
                /**
                 * 登录请求,通知SpringSecurity使用认证请求
                 */
                .loginProcessingUrl("/authentication/form")
                /**
                 * 增加登录成功处理
                 */
                .successHandler(springSecurityAuthenctiationSuccessHandler)
                /**
                 * 增加登录失败处理
                 */
                .failureHandler(springSecurityAuthenctiationFailureHandler)
                .and()
                .authorizeRequests()
                /**
                 * 访问singIn.html时，不需要身份认证
                 */
                .antMatchers("/authentication/require",securityProperties.getBorowser().getLoginPage()).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                /**
                 * 关闭跨站防护攻击
                 */
                .csrf().disable();
    }

    /**
     * 密码加密方式
     *
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
