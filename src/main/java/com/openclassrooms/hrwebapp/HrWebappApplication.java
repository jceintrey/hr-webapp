package com.openclassrooms.hrwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.openclassrooms.hrwebapp.repository.EmployeeProxy;

import lombok.Data;


@SpringBootApplication
public class HrWebappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HrWebappApplication.class, args);
	}

	@Autowired
	private HrProperties hrProperties;

	@Autowired
	private EmployeeProxy employeeProxy;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Propriété apiUrl: " +  hrProperties.getApiUrl());
		System.out.println("Récupération des employés");
		System.out.println(employeeProxy.getEmployees());
	}

	

}
