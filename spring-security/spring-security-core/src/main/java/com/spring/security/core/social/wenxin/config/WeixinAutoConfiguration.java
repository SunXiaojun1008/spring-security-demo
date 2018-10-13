package com.spring.security.core.social.wenxin.config;

import com.spring.security.core.properties.SecurityProperties;
import com.spring.security.core.properties.WeiXinProperties;
import com.spring.security.core.social.SocialAutoConfigurerAdapter;
import com.spring.security.core.social.wenxin.connect.WeixinConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.ConnectionFactory;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.social.wenxin.config
 * @author: 孙
 * @date: 2018/10/13 16:06
 * @description: <p></p>
 **/

@Configuration
@ConditionalOnProperty(prefix = "sxj.spring.security.social.weixin", name = "app-id")
public class WeixinAutoConfiguration extends SocialAutoConfigurerAdapter {

    @Autowired
    private SecurityProperties securityProperties;

    @Override
    protected ConnectionFactory<?> createConnectionFactory() {
        WeiXinProperties weixinConfig = securityProperties.getSocial().getWeixin();
        return new WeixinConnectionFactory(weixinConfig.getProviderId(), weixinConfig.getAppId(),
                weixinConfig.getAppSecret());
    }
}
