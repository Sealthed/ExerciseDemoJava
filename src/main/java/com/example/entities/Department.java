package com.example.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table(name = "Department")
public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Department_id")
    private Long id;

    @Column(name = "Department_name")
    private String name;

    @Column(name = "Start_date")
    private Date startDate;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<DepartmentLocation> locations;
}
