package com.example.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Profile("Dev")
@PropertySource("classpath:figuras.properties")
public class FigurePropertyConfiguration {

    @Bean
    public PropertySourcesPlaceholderConfigurer loadProperties(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
