package com.example.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import list
import com.example.model.Assignment;
import com.example.repos.AssignmentDepository;
//import DTO
import com.example.repos.DTO.AssignmentDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class AssigmentController {
    //create autowried and private assignment depository and get a list of all department in the service
    private AssignmentDepository assignmentDepository;
    @Autowired
    public AssigmentController(AssignmentDepository assignmentDepository) {
        this.assignmentDepository = assignmentDepository;
    }
    @RequestMapping(value = "/assignments", method = RequestMethod.GET)
    public List<Assignment> getAllAssignments() {
        return assignmentDepository.findAll();
    }
    //Update controller to work with DTO
    @RequestMapping(value = "/assignments", method = RequestMethod.POST)
    public Assignment createAssignment(AssignmentDTO assignmentDTO) {
        Assignment assignment = new Assignment();
        assignment.setId(assignmentDTO.getId());
        assignment.setNumberOfHour(assignmentDTO.getNumberOfHour());
        assignment.setEmployee(assignmentDTO.getEmployee());
        assignment.setProject(assignmentDTO.getProject());
        return assignmentDepository.save(assignment);
    }
    // Add other methods for create, update, delete, and fetch
    @RequestMapping(value = "/assignments", method = RequestMethod.PUT)
    public Assignment updateAssignment(AssignmentDTO assignmentDTO) {
        Assignment assignment = new Assignment();
        assignment.setId(assignmentDTO.getId());
        assignment.setNumberOfHour(assignmentDTO.getNumberOfHour());
        assignment.setEmployee(assignmentDTO.getEmployee());
        assignment.setProject(assignmentDTO.getProject());
        return assignmentDepository.save(assignment);
    }
    @RequestMapping(value = "/assignments/{id}", method = RequestMethod.DELETE)
    public void deleteAssignment(Long id) {
        assignmentDepository.deleteById(id);
    }
    @RequestMapping(value = "/assignments/{id}", method = RequestMethod.GET)
    public Assignment getAssignmentById(Long id) {
        return assignmentDepository.findById(id).get();
    }

}
