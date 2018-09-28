package com.spring.security.core.validate.code.image;

import com.spring.security.core.validate.code.AbstractValidateCodeProcesser;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

import javax.imageio.ImageIO;


@Component("imageCodeProcesser")
public class ImageCodeProcesser extends AbstractValidateCodeProcesser<ImageCode> {


    /**
     * 发送图形验证码，将其写到响应中
     *
     * @param request
     * @param imageCode
     * @throws Exception
     */
    @Override
    protected void send(ServletWebRequest request, ImageCode imageCode) throws Exception {
        ImageIO.write(imageCode.getImage(), "JPEG", request.getResponse().getOutputStream());
    }

}
