package com.banana.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {"com.banana.persistence", "com.banana.services"})
@EntityScan(basePackages = "com.banana.models")
@EnableJpaRepositories(basePackages = "com.banana.persistence")
public class SpringConfig {
}
