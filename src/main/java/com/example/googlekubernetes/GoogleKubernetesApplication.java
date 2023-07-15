package com.example.googlekubernetes;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Google-Kubernetes", description = "This project is deployed on Google Kubernetes", version = "0.0.1"))
public class GoogleKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogleKubernetesApplication.class, args);
    }

}
