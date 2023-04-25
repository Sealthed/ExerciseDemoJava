package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "DepartmentLocation")
public class DepartmentLocation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Location")
    private String location;

    @ManyToOne
    @JoinColumn(name = "Deptid", referencedColumnName = "Department_id")
    private Department department;


}

