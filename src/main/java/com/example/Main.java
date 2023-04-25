package com.example;

import com.example.entities.Department;
import com.example.entities.DepartmentLocation;
import com.example.repos.DepartmentLocationRepository;
import com.example.repos.DepartmentRepository;
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

}


