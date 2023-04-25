package com.example.entities;

import com.example.entities.Department;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectid")
    private Long id;

    @Column(name = "area")
    private String area;

    @Column(name = "project_name")
    private String projectName;

    @ManyToOne
    @JoinColumn(name = "managed_department", referencedColumnName = "Department_id")
    private Department department;
}
