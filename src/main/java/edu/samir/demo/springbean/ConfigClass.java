package edu.samir.demo.springbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackageClasses = Address.class)
public class ConfigClass {

    @Bean(name = "primary")
    public Address getPrincipalAddress() {
        return new Address(6,"Corniche Sainte Rosalie",06000);
    }

    @Bean(name = "secondary")
    public Address getSecondaryAddress() {
        return new Address(99,"Moyenne Corniche",06000);
    }

    @Bean
    public Job getJob() {
        return new Job("Developer", new Address(98,"Av. Capgemini",06000));
    }

}
