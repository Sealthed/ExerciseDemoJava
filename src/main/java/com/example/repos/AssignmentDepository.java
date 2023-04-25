package com.example.repos;

import com.example.entities.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentDepository extends JpaRepository<Assignment,Long> {
}
