package com.example.repos;

import com.example.entities.DepartmentLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentLocationRepository extends CrudRepository<DepartmentLocation, Long> {
}