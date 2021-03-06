package com.spring.security.core.validate.code;


import com.spring.security.core.properties.SecurityConstants;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.validate.code
 * @author: 孙
 * @date: 2018/10/12 19:12
 * @description: <p></p>
 **/
public enum ValidateCodeType {

    /**
     * 短信验证码
     */
    SMS {
        @Override
        public String getParamNameOnValidate() {
            return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_SMS;
        }
    },
    /**
     * 图片验证码
     */
    IMAGE {
        @Override
        public String getParamNameOnValidate() {
            return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_IMAGE;
        }
    };

    /**
     * 校验时从请求中获取的参数的名字
     * @return
     */
    public abstract String getParamNameOnValidate();

}
