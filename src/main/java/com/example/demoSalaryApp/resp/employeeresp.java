package com.example.demoSalaryApp.resp;

import com.example.demoSalaryApp.models.employeemodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeresp extends JpaRepository<employeemodel, Long> {
}
