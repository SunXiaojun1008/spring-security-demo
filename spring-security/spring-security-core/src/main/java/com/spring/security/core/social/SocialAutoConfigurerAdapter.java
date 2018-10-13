package com.spring.security.core.social;

import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.UserIdSource;
import org.springframework.social.config.annotation.ConnectionFactoryConfigurer;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.util.Assert;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.social.qq.config
 * @author: 孙
 * @date: 2018/10/13 11:21
 * @description: <p></p>
 **/
public abstract class SocialAutoConfigurerAdapter extends SocialConfigurerAdapter {
    @Override
    public void addConnectionFactories(ConnectionFactoryConfigurer configurer,
                                       Environment environment) {
        configurer.addConnectionFactory(createConnectionFactory());
    }

    protected abstract ConnectionFactory<?> createConnectionFactory();

    /**
     * 注：springBoot2.0+版本不存在social包，顾只能自己实现getUserIdSource功能
     */
    private static class SecurityContextUserIdSource implements UserIdSource {
        @Override
        public String getUserId() {
            SecurityContext context = SecurityContextHolder.getContext();
            Authentication authentication = context.getAuthentication();
            Assert.state(authentication != null,
                    "Unable to get a " + "ConnectionRepository: no user signed in");
            return authentication.getName();
        }

    }
    @Override
    public UserIdSource getUserIdSource() {
        return new SecurityContextUserIdSource();
    }
}
