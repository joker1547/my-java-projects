package com.subrsa.learning.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties
public class DockerMain {
    public static void main(String[] args) {
        SpringApplication.run(DockerMain.class, args);
    }

}
