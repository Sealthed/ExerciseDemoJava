package com.example.repos.DTO;

//Import DTO for assignment
import com.example.model.Employee;
import com.example.model.Project;



public class AssignmentDTO {
    //create DTO functions using lambok for assignment
    private Long id;
    private Integer numberOfHour;
    private Employee employee;
    private Project project;

    //Getter and setter for assignment DTO
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getNumberOfHour() {
        return numberOfHour;
    }
    public void setNumberOfHour(Integer numberOfHour) {
        this.numberOfHour = numberOfHour;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
}
