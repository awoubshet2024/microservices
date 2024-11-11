package com.alem.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "discount.offer")
@Component
public class Discount {
   private int price;
}
