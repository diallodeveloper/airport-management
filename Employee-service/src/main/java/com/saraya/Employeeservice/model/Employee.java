package com.saraya.Employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String firstname;
    private String lastname;

    @Column(columnDefinition = "date")
    private LocalDate birthdate;

    @Column(unique = true)
    private String email;

    private String sex;
    private double salary;
    private String street;
    private String city;
    private String country;
    private int zip;

    @Column(unique = true)
    private String telephone;

    @Column(unique = true)
    private String username;
    private String password;

}
