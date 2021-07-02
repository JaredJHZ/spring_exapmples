package com.example.dependencyinjection.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Profile("Prod")
@PropertySource("classpath:figuras_prod.properties")
public class FigurePropertyProdConfiguration {
    @Bean
    public PropertySourcesPlaceholderConfigurer loadProperties(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
