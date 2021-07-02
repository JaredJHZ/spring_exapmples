package com.example.dependencyinjection.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MyService {

    public String saludo = "hola";

}
