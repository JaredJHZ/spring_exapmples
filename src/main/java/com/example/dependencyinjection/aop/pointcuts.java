package com.example.dependencyinjection.aop;


import org.aspectj.lang.annotation.Pointcut;

public class pointcuts {

//    @Pointcut("execution(* com.example.dependencyinjection.aop.TargetObject.hello(..))")
//    public void allTargetObjectsMethods(){
//
//    }
//    @Pointcut("@annotation(JaredController)")
//    public void allTargetObjectsMethods(){
//
//    }
    @Pointcut("within(com.example.dependencyinjection.aop.TargetObject)")
    public void allTargetObjectsMethods(){

    }
}
