package com.example.dependencyinjection.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Aspect
@Component
@Order(2)
public class MyAspectTwo {

    private static final Logger log = LoggerFactory.getLogger(MyAspectTwo.class);

    @Before("com.example.dependencyinjection.aop.pointcuts.allTargetObjectsMethods()")
    public void secondLogger(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();

        log.info("2Arguments : {}", joinPoint.getArgs());
        log.info("2Modifiers : {}", signature.getModifiers());
        log.info("2Name: {}",signature.getName());
        log.info("2Return type {}", signature.getDeclaringType());
        log.info("2Before advice");
    }

}
