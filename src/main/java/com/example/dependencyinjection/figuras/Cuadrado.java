package com.example.dependencyinjection.figuras;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cuadrado implements Figura {

    @Value("${square.side:1}")
    private double lado;

    @Override
    public double getArea() {
        return lado * lado;
    }
}
