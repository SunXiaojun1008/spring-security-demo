package com.spring.security.core.social.qq.config;

import com.spring.security.core.properties.QQProperties;
import com.spring.security.core.properties.SecurityProperties;
import com.spring.security.core.social.SocialAutoConfigurerAdapter;
import com.spring.security.core.social.qq.connect.QQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.UserIdSource;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.util.Assert;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.social.qq.config
 * @author: 孙
 * @date: 2018/10/13 10:46
 * @description: <p></p>
 **/
@Configuration
@ConditionalOnProperty(prefix = "sxj.spring.security.social.qq",name="app-id")
public class QQAutoConfig extends SocialAutoConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    protected ConnectionFactory<?> createConnectionFactory() {
        QQProperties qqConfig = securityProperties.getSocial().getQq();
        return new QQConnectionFactory(qqConfig.getProviderId(),qqConfig.getAppId(),qqConfig.getAppSecret());
    }


}
