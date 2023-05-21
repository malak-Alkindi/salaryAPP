package com.example.demoSalaryApp.responseopject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetEmployeeResponse {
    String name;

    String designation;

    Double salary;
}
