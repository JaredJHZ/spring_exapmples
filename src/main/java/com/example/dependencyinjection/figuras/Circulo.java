package com.example.dependencyinjection.figuras;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circulo implements Figura{

    @Value("${circle.radius:2}")
    private double radius;

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
