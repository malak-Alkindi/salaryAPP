package com.example.demoSalaryApp.requestobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetEmployeeRequestObject {
    String name;

    String designation;

    Double salary;
}
