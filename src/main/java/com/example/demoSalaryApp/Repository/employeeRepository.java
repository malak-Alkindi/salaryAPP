package com.example.demoSalaryApp.Repository;

import com.example.demoSalaryApp.models.employeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employeeModel, Long> {
}
