package com.spring.security.core.properties;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.properties
 * @author: 孙
 * @date: 2018/10/13 10:45
 * @description: <p></p>
 **/
public class SocialProperties {
    private String filterProcessesUrl = "/auth";

    private QQProperties qq = new QQProperties();

    private WeiXinProperties weixin = new WeiXinProperties();

    public String getFilterProcessesUrl() {
        return filterProcessesUrl;
    }

    public void setFilterProcessesUrl(String filterProcessesUrl) {
        this.filterProcessesUrl = filterProcessesUrl;
    }

    public QQProperties getQq() {
        return qq;
    }

    public void setQq(QQProperties qq) {
        this.qq = qq;
    }

    public WeiXinProperties getWeixin() {
        return weixin;
    }

    public void setWeixin(WeiXinProperties weixin) {
        this.weixin = weixin;
    }
}
