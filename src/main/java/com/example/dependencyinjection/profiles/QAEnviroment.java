package com.example.dependencyinjection.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("QA")
public class QAEnviroment implements EnviromentService{

    @Override
    public String getEnviroment() {
        return "QA";
    }
}
