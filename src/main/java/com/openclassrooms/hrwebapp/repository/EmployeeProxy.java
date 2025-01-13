package com.openclassrooms.hrwebapp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.openclassrooms.hrwebapp.HrProperties;
import com.openclassrooms.hrwebapp.model.Employee;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EmployeeProxy {
     @Autowired
    private HrProperties props;

    /**
    * Get all employees
    * @return An iterable of all employees
    */

    public Iterable<Employee> getEmployees() {
        String baseApiUrl = props.getApiUrl();
        String getEmployeesUrl = baseApiUrl + "/employees";

        
        log.debug("Constructed URL: {}", getEmployeesUrl);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<Employee>> response = restTemplate.exchange(
                getEmployeesUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<Employee>>() {}
                );

        log.debug("Get Employees call " + response.getStatusCode().toString());
        
        return response.getBody();
    }

}
