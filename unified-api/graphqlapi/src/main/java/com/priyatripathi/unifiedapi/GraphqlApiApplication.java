package com.priyatripathi.unifiedapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class GraphqlApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphqlApiApplication.class, args);
    }
}
