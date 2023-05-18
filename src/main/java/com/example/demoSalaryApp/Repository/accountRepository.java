package com.example.demoSalaryApp.Repository;

import com.example.demoSalaryApp.models.accountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface accountRepository extends JpaRepository<accountModel, Long> {
}
