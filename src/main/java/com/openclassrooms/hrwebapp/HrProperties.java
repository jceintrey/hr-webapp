package com.openclassrooms.hrwebapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.openclassrooms.hrwebapp")
@Data
public class HrProperties {
    private String apiUrl;

}
