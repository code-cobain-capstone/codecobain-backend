package com.minjikim.codecobainbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.minjikim.codecobainbackend.config")
public class CodecobainBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodecobainBackendApplication.class, args);
    }
}
