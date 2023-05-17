package com.example.demoSalaryApp.responseopject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAccountResponse {
    String bankName;

    String accountNumber;

    String bankBranch;

    String swiftCode;


}
