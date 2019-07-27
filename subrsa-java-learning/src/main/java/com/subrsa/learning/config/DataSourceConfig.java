package com.subrsa.learning.config;

import com.subrsa.learning.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Autowired
    AboutSanthose aboutSanthose;

    @Bean(name = "appOwner")
    public Person aboutOwner() {
        return new Person(aboutSanthose.getFirst(), aboutSanthose.getLast());
    }

/*
*There are many other options available under @Conditional annotation, as follows:
@ConditionalOnClass
@ConditionalOnProperty
@ConditionalOnMissingBean
@ConditionalOnMissingClass
 */
}