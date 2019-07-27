package com.subrsa.learning.docker.controller;

import com.github.dockerjava.api.model.Image;
import com.subrsa.learning.docker.service.DockerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class DockerRestController {
    @Autowired
    DockerService dockerService;

    @GetMapping("/images")
    public List<Image> getImages() {
        try {
            List<Image> images = dockerService.getAvailableImages();
            images.stream().forEach(r -> log.info(r.toString()));
            return images;
        } catch (Exception e) {
            log.error("Exception", e);

        }
        return null;
    }
}
