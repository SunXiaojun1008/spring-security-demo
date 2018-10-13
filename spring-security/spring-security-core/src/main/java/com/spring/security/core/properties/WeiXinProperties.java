package com.spring.security.core.properties;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.properties
 * @author: 孙
 * @date: 2018/10/13 15:56
 * @description: <p></p>
 **/
public class WeiXinProperties extends BaseSocialProperties {
    private String providerId = "weixin";

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

}
