package com.example.demoSalaryApp.services;
import com.example.demoSalaryApp.resp.accountresp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoSalaryApp.models.accountmodel;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.example.demoSalaryApp.responseopject.GetAccountResponse;

@Service
public class accountservice {
    @Autowired
    accountresp accountresp;

    public void saveAccount(accountmodel accoun) {
        accountresp.save(accoun);
    }

    public List<accountmodel> getAccount() {
        return accountresp.findAll();
    }

    public List<accountmodel> getOneAccount() {
        return accountresp.findAllById(Collections.singleton((long) 2));
    }


    public GetAccountResponse getEmployeeById(Long employeeId) {
        Optional<accountmodel> optionalaccount = accountresp.findById(employeeId);
        if (!optionalaccount.isEmpty()) {
            accountmodel account = optionalaccount.get();
            GetAccountResponse employeeResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(),
                    account.getBankBranch(), account.getSwiftCode());
            return employeeResponse;
        }

        return null;

    }

    public GetAccountResponse getAccountAsString(accountmodel account) {


        GetAccountResponse employeeResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(),
                account.getBankBranch(), account.getSwiftCode());
        return employeeResponse;

    }

    public void deleteEmployeeById(Long employeeId) {

        accountresp.deleteById(employeeId);

}}