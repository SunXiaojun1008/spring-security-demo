package com.spring.security.core.validate.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Copyright (C), 2017-2018, sunxiaojun
 * @path: com.spring.security.core.validate.code
 * @author: 孙
 * @date: 2018/10/12 19:15
 * @description: <p></p>
 **/
@Component
public class ValidateCodeProcesserHolder {

    @Autowired
    private Map<String, ValidateCodeProcesser> validateCodeProcessers;

    public ValidateCodeProcesser findValidateCodeProcesser(ValidateCodeType type) {
        return findValidateCodeProcesser(type.toString().toLowerCase());
    }

    public ValidateCodeProcesser findValidateCodeProcesser(String type) {
        String name = type.toLowerCase() + ValidateCodeProcesser.class.getSimpleName();
        ValidateCodeProcesser processer = validateCodeProcessers.get(name);
        if (processer == null) {
            throw new ValidateCodeException("验证码处理器" + name + "不存在");
        }
        return processer;
    }
}
