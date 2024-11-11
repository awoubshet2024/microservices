package com.alem;

import com.alem.config.Discount;
import com.alem.config.SecurityConfig;
import com.alem.config.SwagerConfig;
import jakarta.annotation.PostConstruct;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner {
    private final Discount discount;
   // @Value("${discount.off.price}")
    @Value("${spring.profiles.active}")
    private String envArgs;
    //@Value("${discount.off.price}")
   // private int discount;

    private Environment env;

    public CustomerApplication(Discount discount) {
        this.discount = discount;
    }

    public static void main(String[] args) {

        SpringApplication.run(CustomerApplication.class, args);

    }
    @PostConstruct
    public void displayDiscount(){
        System.out.printf("Discount price from is: " + discount);


    }

    @Override
    public void run(String... args) throws Exception {
        System.out.printf("Discount price is: %s%n",envArgs);
        //System.out.printf("Environment price is: " + env.getProperty("discount.off.price"));
    }
}