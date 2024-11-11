package com.alem;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CustomerApplication.class);
        //application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
