package com.example.dependencyinjection;

import com.example.dependencyinjection.aop.TargetObject;
import com.example.dependencyinjection.figuras.AreaService;
import com.example.dependencyinjection.lifecycle.LifeCycleBean;
import com.example.dependencyinjection.profiles.EnviromentService;
import com.example.dependencyinjection.scopes.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class DependencyInjectionApplication {

    private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

    @Bean
    public String getAppName() {
        return "OA";
    }

    public static void main(String[] args) {



        ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

        //LifeCycleBean beanAware = context.getBean(LifeCycleBean.class);

        //AreaService bean1 = context.getBean(AreaService.class);

        //bean1.describirAreas();

        TargetObject targetObject = context.getBean(TargetObject.class);
        targetObject.hello("world con aspectos");

    }

}
