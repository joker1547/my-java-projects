package com.subrsa.learning.controller;

import com.subrsa.learning.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpoint;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ControllerEndpoint(id = "appBeansList")
public class MyBeansList {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    Person appOwner;

    @GetMapping("/beansList")
    @ResponseBody
    public String getBeansList() {
        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        StringBuilder beans = new StringBuilder();
        for (String beanName : allBeanNames) {
            beans.append(beanName).append("\n");
        }
        return beans.toString();
    }
}
