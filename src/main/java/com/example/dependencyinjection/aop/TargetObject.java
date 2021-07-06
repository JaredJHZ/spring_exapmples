package com.example.dependencyinjection.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TargetObject {
    private static final Logger log = LoggerFactory.getLogger(TargetObject.class);

    @JaredController()
    public void hello(String msg) {
        log.info("Hello "+msg);
    }
}
