package com.example.utils;

//import list for assignment utility class
import com.example.model.Assignment;
import com.example.repos.DTO.AssignmentDTO;

public class DTOutils {
    //create toAssignmentDTO method for assignment
    public static AssignmentDTO toAssignmentDTO(Assignment assignment) {
        AssignmentDTO assignmentDTO = new AssignmentDTO();
        assignmentDTO.setId(assignment.getId());
        assignmentDTO.setNumberOfHour(assignment.getNumberOfHour());
        assignmentDTO.setEmployee(assignment.getEmployee());
        assignmentDTO.setProject(assignment.getProject());
        return assignmentDTO;
    }
        //create to assignment method for assignment
    public static Assignment toAssignment(AssignmentDTO assignmentDTO) {
        Assignment assignment = new Assignment();
        assignment.setId(assignmentDTO.getId());
        assignment.setNumberOfHour(assignmentDTO.getNumberOfHour());
        assignment.setEmployee(assignmentDTO.getEmployee());
        assignment.setProject(assignmentDTO.getProject());
        return assignment;
    }
}
