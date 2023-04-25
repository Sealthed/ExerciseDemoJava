package com.example.services;

import com.example.model.Assignment;
import com.example.repos.AssignmentDepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AssisgnmentService {
    //create autowried and private assignment depository and get a list of all department in the service
   private AssignmentDepository assignmentDepository;
    @Autowired
    public AssisgnmentService(AssignmentDepository assignmentDepository) {
        this.assignmentDepository = assignmentDepository;
    }
    public List<Assignment> getAllAssignments() {
        return assignmentDepository.findAll();
    }
    // Add other methods for create, update, delete, and fetch
    public Assignment createAssignment(Assignment assignment) {
        return assignmentDepository.save(assignment);
    }
    public Assignment updateAssignment(Assignment assignment) {
        return assignmentDepository.save(assignment);
    }
    public void deleteAssignment(Long id) {
        assignmentDepository.deleteById(id);
    }
    public Assignment getAssignmentById(Long id) {
        return assignmentDepository.findById(id).get();
    }

}

