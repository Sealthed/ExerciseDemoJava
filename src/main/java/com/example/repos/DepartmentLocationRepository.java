package com.example.repos;

import com.example.entities.DepartmentLocation;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentLocationRepository extends CrudRepository<DepartmentLocation, Long> {
}