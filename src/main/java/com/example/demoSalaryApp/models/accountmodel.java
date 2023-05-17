package com.example.demoSalaryApp.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Data
public class accountmodel  extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String bankName;

    String accountNumber;

    String bankBranch;

    String swiftCode;

    String accountHolderName;

    String accountType;

    Integer branchCode;
}
