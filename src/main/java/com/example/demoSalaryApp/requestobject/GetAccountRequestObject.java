package com.example.demoSalaryApp.requestobject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetAccountRequestObject {
    String bankName;

    String accountNumber;

    String bankBranch;

    String swiftCode;

    String accountHolderName;

    String accountType;

    Integer branchCode;
}
