package com.subrsa.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class JavaLearning {

    public static void main(String[] args) {
        SpringApplication.run(JavaLearning.class, args);
    }

}
