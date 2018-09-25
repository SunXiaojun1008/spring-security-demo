package com.spring.security.web.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 切片（）
 */
@Aspect
@Component
public class MyAspect {

    @Around("execution(* com.spring.security.web.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint point) throws Throwable {

        System.out.println("aspect  start ");

        Object[] args = point.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        long start = new Date().getTime();

        Object object = point.proceed();

        System.out.println("aspect 耗时： " + (new Date().getTime() - start));

        System.out.println("aspect end ");

        return object;

    }
}
