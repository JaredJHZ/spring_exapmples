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
@Order(1)
public class MyAspect {

    private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

    // primero  * Cualquier valor de retorno
    // segundo nombre cualificado de la clase
    // tercero * cualquier metodo de esa clase
    // (..) -> cualquier cantidad de parametros



    @Before("com.example.dependencyinjection.aop.pointcuts.allTargetObjectsMethods()")
    public void before(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();

        log.info("Arguments : {}", joinPoint.getArgs());
        log.info("Modifiers : {}", signature.getModifiers());
        log.info("Name: {}",signature.getName());
        log.info("Return type {}", signature.getDeclaringType());
        log.info("Before advice");
    }

}
