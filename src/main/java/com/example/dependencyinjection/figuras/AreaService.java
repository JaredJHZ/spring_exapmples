package com.example.dependencyinjection.figuras;

import com.example.dependencyinjection.DependencyInjectionApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class AreaService {

    private static final Logger log = LoggerFactory.getLogger(AreaService.class);

    @Autowired
    private List<Figura> figuras;

    public void describirAreas(){
        System.out.println(figuras.isEmpty());
        Stream<Figura> streamFiguras = figuras.stream();
        streamFiguras.forEach(
                figura -> log.info("Area es {}", figura.getArea())
        );
    }


}
