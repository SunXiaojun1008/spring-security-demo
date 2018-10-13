package com.spring.security.core.social.wenxin.api;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.social.wenxin.api
 * @author: 孙
 * @date: 2018/10/13 16:01
 * @description: <p></p>
 **/
public interface WeiXin {
    WeixinUserInfo getUserInfo(String openId);
}

