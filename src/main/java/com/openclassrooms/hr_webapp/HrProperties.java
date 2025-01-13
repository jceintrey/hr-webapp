package com.openclassrooms.hr_webapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "com.openclassrooms.hr-webapp")
@Data
public class HrProperties {
    private String apiUrl;
}
