package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner initDatabase(DepartmentRepository departmentRepository, DepartmentLocationRepository departmentLocationRepository) {
        return args -> {
            // Create a new Department
            Department department = new Department();
            department.setName("IT");
            department.setStartDate(new Date());

            // Create a new DepartmentLocation
            DepartmentLocation location = new DepartmentLocation();
            location.setLocation("Building A");
            location.setDepartment(department);

            // Persist the objects
            departmentRepository.save(department);
            departmentLocationRepository.save(location);
        };
    }
}
