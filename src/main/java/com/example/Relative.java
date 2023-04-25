package com.example;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table (name = "Relatives")
public class Relative implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "fullName")
    private String fullName;

    @Column (name = "gender")
    private int gender;

    @Column (name = "phoneNumber")
    private String phoneNumber;

    @Column (name = "relationship")
    private String relationship;

    @ManyToOne
    @JoinColumn (name = "employeeid", referencedColumnName = "employeeid")
    private Employee employee;
    
}
