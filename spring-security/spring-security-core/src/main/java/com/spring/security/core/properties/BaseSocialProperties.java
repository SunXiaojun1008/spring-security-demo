package com.spring.security.core.properties;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.properties
 * @author: 孙
 * @date: 2018/10/13 15:57
 * @description: <p></p>
 **/
public abstract class BaseSocialProperties {

    /**
     * Application id.
     */
    private String appId;

    /**
     * Application secret.
     */
    private String appSecret;

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

}
