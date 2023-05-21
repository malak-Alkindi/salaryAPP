package com.example.demoSalaryApp.services;
import com.example.demoSalaryApp.Repository.accountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoSalaryApp.models.accountModel;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.example.demoSalaryApp.responseopject.GetAccountResponse;

@Service
public class accountService {
    @Autowired
    accountRepository accountresp;

    public void saveAccount(accountModel accoun) {
        accountresp.save(accoun);
    }

    public List<accountModel> getAccount() {
        return accountresp.findAll();
    }

    public List<accountModel> getOneAccount() {
        return accountresp.findAllById(Collections.singleton((long) 2));
    }


    public GetAccountResponse getEmployeeById(Long employeeId) {
        Optional<accountModel> optionalaccount = accountresp.findById(employeeId);
        if (!optionalaccount.isEmpty()) {
            accountModel account = optionalaccount.get();
            GetAccountResponse AccountResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(),
                    account.getBankBranch(), account.getSwiftCode());
            return AccountResponse;
        }

        return null;

    }

    public GetAccountResponse getAccountObjectAsString(accountModel account) {


        GetAccountResponse employeeResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber(),
                account.getBankBranch(), account.getSwiftCode());
        return employeeResponse;

    }

    public void deleteEmployeeById(Long employeeId) {

        accountresp.deleteById(employeeId);

}}