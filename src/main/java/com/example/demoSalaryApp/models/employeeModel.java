package com.example.demoSalaryApp.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class employeeModel extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "employee_name")
    String name;

    String designation;

    Double salary;

    String department;

    String companyName;

    String gender;
}
