package com.alem.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig {

    private final SwagerConfig swager;
    public SecurityConfig(SwagerConfig swager) {
        this.swager = swager;
        System.out.println("Value from swager is " + swager.getName());
    }
}
