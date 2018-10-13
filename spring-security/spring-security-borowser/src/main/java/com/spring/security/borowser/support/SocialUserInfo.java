package com.spring.security.borowser.support;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.borowser.support
 * @author: 孙
 * @date: 2018/10/13 16:35
 * @description: <p></p>
 **/
public class SocialUserInfo {
    private String providerId;

    private String providerUserId;

    private String nickname;

    private String headimg;

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderUserId() {
        return providerUserId;
    }

    public void setProviderUserId(String providerUserId) {
        this.providerUserId = providerUserId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

}
