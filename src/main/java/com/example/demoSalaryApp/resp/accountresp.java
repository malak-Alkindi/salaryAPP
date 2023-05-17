package com.example.demoSalaryApp.resp;

import com.example.demoSalaryApp.models.accountmodel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface accountresp extends JpaRepository<accountmodel, Long> {
}
