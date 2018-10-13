package com.spring.security.core.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置读取sxj.spring.security前缀的配置
 */
@ConfigurationProperties(prefix = "sxj.spring.security")
public class SecurityProperties {

    private BorowserProperties borowser = new BorowserProperties();

    private ValidateCodeProperties code = new ValidateCodeProperties();

    private SocialProperties social = new SocialProperties();

    public BorowserProperties getBorowser() {
        return borowser;
    }

    public void setBorowser(BorowserProperties borowser) {
        this.borowser = borowser;
    }

    public ValidateCodeProperties getCode() {
        return code;
    }

    public void setCode(ValidateCodeProperties code) {
        this.code = code;
    }

    public SocialProperties getSocial() {
        return social;
    }

    public void setSocial(SocialProperties social) {
        this.social = social;
    }
}
