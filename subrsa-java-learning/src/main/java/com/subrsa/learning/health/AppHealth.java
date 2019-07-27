package com.subrsa.learning.health;

import com.subrsa.learning.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppHealth implements HealthIndicator {
    @Autowired
    ApplicationContext applicationContext;

    @Qualifier("aboutOwner")
    Person aboutOwner;

    public Health health() {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        StringBuilder beans = new StringBuilder();
        for(String beanName : allBeanNames) {
            beans.append(beanName).append("\n");
        }
        return Health.up().withDetail("beanNames", beans.toString()).build();
    }
}
