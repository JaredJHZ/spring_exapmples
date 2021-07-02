package com.example.dependencyinjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Prod")
public class ProdEnviroment implements EnviromentService {
    @Override
    public String getEnviroment() {
        return "Prod";
    }
}
