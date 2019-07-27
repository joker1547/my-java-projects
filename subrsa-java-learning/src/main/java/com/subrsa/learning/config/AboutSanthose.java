package com.subrsa.learning.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="santhose")
@Data
//EnableConfigurationProperties must be enabled for this class to work
public class AboutSanthose {
    private String first;
    private String last;
}
