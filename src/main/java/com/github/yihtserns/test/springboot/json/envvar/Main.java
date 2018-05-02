package com.github.yihtserns.test.springboot.json.envvar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author yihtserns
 */
@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class Main {

    @Autowired
    private MyProperties props;

    @Value("${com.github.yihtserns.test}")
    private String test;

    @PostConstruct
    public void init() {
        System.out.println("XXXXXXXXXXXXXXXXXx: " + props.testMapping);
        System.out.println("Test: " + props.test);
        System.out.println("Test2: " + test);
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
        MyProperties props = ctx.getBean(MyProperties.class);
    }
}
