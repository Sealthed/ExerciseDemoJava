package com.example.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

    @Id
    @Column(name = "employee_id")
    private String id;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "salary")
    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "deptid", referencedColumnName = "Department_id")
    private Department department;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private Set<Assignment> assignments;
}

