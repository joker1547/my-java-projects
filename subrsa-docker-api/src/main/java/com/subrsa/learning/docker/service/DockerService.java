package com.subrsa.learning.docker.service;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DockerService {
    @Autowired
    DockerClient dockerClient;

    public List<Image> getAvailableImages() {
        List<Image> images = dockerClient.listImagesCmd().withShowAll(true).exec();
        return images;
    }
}
