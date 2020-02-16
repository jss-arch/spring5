package com.jss.teste.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ConfigurationProperties(prefix = "string")
//@PropertySource("classpath:application-dev.properties")
public class PropertyConfig {

    //@Value("${string.teste}")
    private String teste;

//    @Bean
//    public FakeDataSource fakeDataSource() {
//        return new FakeDataSource();
//    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }

}
