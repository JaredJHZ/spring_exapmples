package com.example.dependencyinjection.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

    @Override
    public void setBeanName(String s) {
        log.info("Bean name aware is {}",s);
    }

    @PostConstruct
    public void init(){
        log.info("Entering lifecycle init");
    }

    @PreDestroy
    public void destroyBean(){
        log.info("Entering predestroy");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("Entering after properties");
    }

    @Override
    public void destroy() throws Exception {
        log.info("Entering destroy");
    }
}
